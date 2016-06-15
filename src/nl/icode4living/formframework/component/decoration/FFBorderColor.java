package nl.icode4living.formframework.component.decoration;

import nl.icode4living.formframework.component.FFComponent;

import java.awt.*;


/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class FFBorderColor extends FFDecoration {

    private Color c;
    private int s;

    public FFBorderColor(FFComponent temp, Color c, Integer s) {
        super(temp);
        this.c = c;
        this.s = s != null ? s : 1;
    }

    @Override
    public void draw(Graphics2D gc2d) {
        super.draw(gc2d);

        gc2d.setColor(c);

        for (int i = 0; i < s; i++)
            gc2d.drawRect(
                    getX() + i,
                    getY() + i,
                    getWidth() - i * 2,
                    getHeight() - i * 2
            );

    }
}
