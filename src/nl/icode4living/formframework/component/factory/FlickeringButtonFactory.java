package nl.icode4living.formframework.component.factory;

import nl.icode4living.formframework.component.FFBase;
import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.decoration.FFBackgroundFlickering;
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
public class FlickeringButtonFactory implements FFButtonFactory {

    protected FlickeringButtonFactory() {
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h) {
        return new FFTextColor(
                new FFBackgroundFlickering(
                        new FFBase(text, x, y, w, h),
                        10
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
        return null;
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h, FFOnClickListener la, FFOnEnterListener lb) {
        return null;
    }

    public FFComponent construct(String text, int x, int y, int w, int h, int speed) {
        return new FFTextColor(
                new FFBackgroundFlickering(
                        new FFBase(text, x, y, w, h),
                        speed
                ),
                Color.BLACK,
                12
        );
    }

    public FFComponent construct(String text, int x, int y, int w, int h, int speed, FFOnClickListener listener) {
        FFComponent c = construct(text, x, y, w, h, speed);
        c.setOnClickListener(listener);
        return c;
    }

    public FFComponent construct(String text, int x, int y, int w, int h, int speed, FFOnEnterListener listener) {
        FFComponent c = construct(text, x, y, w, h, speed);
        c.setOnMouseEnterListener(listener);
        return c;
    }

    public FFComponent construct(String text, int x, int y, int w, int h, int speed, FFOnClickListener la, FFOnEnterListener lb) {
        FFComponent c = construct(text, x, y, w, h, speed);
        c.setOnClickListener(la);
        c.setOnMouseEnterListener(lb);
        return c;
    }
}