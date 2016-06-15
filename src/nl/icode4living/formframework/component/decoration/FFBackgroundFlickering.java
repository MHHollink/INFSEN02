package nl.icode4living.formframework.component.decoration;

import nl.icode4living.formframework.component.FFComponent;

import java.awt.*;
import java.util.Random;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 15-6-2016.
 */
public class FFBackgroundFlickering extends FFDecoration {

    private Random r;

    public FFBackgroundFlickering(FFComponent temp, int flickerSpeed) {
        super(temp);

        r = new Random();
    }

    @Override
    public void draw(Graphics2D g) {
        super.draw(g);

        g.setColor(
                new Color(
                        r.nextInt(256),
                        r.nextInt(256),
                        r.nextInt(256)
                )
        );
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}
