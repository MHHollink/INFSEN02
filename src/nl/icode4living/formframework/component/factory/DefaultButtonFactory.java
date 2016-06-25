package nl.icode4living.formframework.component.factory;

import nl.icode4living.formframework.component.FFBase;
import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.decoration.FFBackgroundColored;
import nl.icode4living.formframework.component.decoration.FFTextColor;
import nl.icode4living.formframework.component.observer.FFOnClickListener;
import nl.icode4living.formframework.component.observer.FFOnEnterListener;

import java.awt.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 24-6-2016.
 */
public class DefaultButtonFactory implements FFButtonFactory {

    protected DefaultButtonFactory() {
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h) {
        return new FFTextColor(
                new FFBackgroundColored(
                        new FFBase(text, x, y, w, h),
                        Color.LIGHT_GRAY
                ),
                Color.BLACK,
                12
        );
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h, FFOnClickListener listener) {
        FFComponent c = construct(text, x, y, w, h);
        c.setOnClickListener(listener);
        return c;
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h, FFOnEnterListener l) {
        FFComponent c = construct(text, x, y, w, h);
        c.setOnMouseEnterListener(l);
        return c;
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h, FFOnClickListener la, FFOnEnterListener lb) {
        FFComponent c = construct(text, x, y, w, h);
        c.setOnClickListener(la);
        c.setOnMouseEnterListener(lb);
        return c;    }
}
