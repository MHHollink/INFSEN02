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

    int flickerSpeed;
    int delta;
    Color c;
    Random r;

    public FFBackgroundFlickering(FFComponent temp, int flickerSpeed) {
        super(temp);
        this.flickerSpeed = flickerSpeed;
        this.delta = 0;
        this.r = new Random();
        this.c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    @Override
    public void draw(Graphics2D g) {
        super.draw(g);
        if(delta++ >= flickerSpeed) {
            delta = 0;
            c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
        }
        g.setColor(c);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}
