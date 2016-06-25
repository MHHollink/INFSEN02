package nl.icode4living.formframework.component.factory;

import nl.icode4living.formframework.component.FFBase;
import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.decoration.FFTextColor;

import java.awt.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 25-6-2016.
 */
public class DefaultLabelFactory  implements FFLabelFactory{

    protected DefaultLabelFactory() {
    }

    @Override
    public FFComponent construct(String text, int x, int y) {
        return construct(text, x, y, 0, 0);
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h) {
        return new FFTextColor(
                new FFBase(text, x, y, w, h),
                Color.BLACK,
                12
        );
    }
}
