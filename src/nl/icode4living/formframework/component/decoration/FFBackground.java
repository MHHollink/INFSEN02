package nl.icode4living.formframework.component.decoration;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import nl.icode4living.formframework.component.FFComponent;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 02-6-2016.
 */
public class FFBackground extends FFDecoration {

    private Color backgroundColor;

    public FFBackground(FFComponent temp, Color backgroundColor) {
        super(temp);
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void draw(GraphicsContext g) {
        super.draw(g);

        int x,y,width,height;
        x = getX();
        y = getY();
        width = getWidth();
        height = getHeight();

        g.setFill(backgroundColor);
        g.fillRect(x, y, width, height);

    }
}
