package nl.icode4living.formframework.component;

import java.awt.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class FFBase extends AbsFFComponent{

    public FFBase(String text) {
        setText(text);
    }

    public FFBase(String text, int x, int y, int w, int h) {
        this(text);
        setX(x);
        setY(y);
        setHeight(h);
        setWidth(w);
    }

    @Override
    public void draw(Graphics2D gc2d) {

    }
}
