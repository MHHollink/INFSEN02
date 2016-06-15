package nl.icode4living.formframework.component.decoration;

import nl.icode4living.formframework.component.FFComponent;

import java.awt.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 02-6-2016.
 */
public class FFBackgroundColored extends FFDecoration {

    private Color backgroundColor;

    public FFBackgroundColored(FFComponent temp, Color backgroundColor) {
        super(temp);
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void draw(Graphics2D g) {
        super.draw(g);

        g.setColor(backgroundColor);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

}
