package nl.icode4living.formframework.component.decoration;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import nl.icode4living.formframework.component.FFComponent;


/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class FFBorderColor extends FFDecoration {

    private Color c;
    private double s;

    public FFBorderColor(FFComponent temp, Color c, Double s) {
        super(temp);
        this.c = c;
        this.s = s != null ? s : 1;
    }

    @Override
    public void draw(GraphicsContext gc2d) {
        super.draw(gc2d);

        double x,y,width,height;

        x = getX();
        y = getY();
        width = getWidth();
        height = getHeight();

        gc2d.setStroke(c);
        gc2d.setLineWidth(s);
        gc2d.strokeLine(x+(s/2), y+(s/2), x+width-(s/2), y+(s/2));
        gc2d.strokeLine(x+width-(s/2), y+(s/2), x+width-(s/2), y+height-(s/2));
        gc2d.strokeLine(x+(s/2), y+height-(s/2), x+width-(s/2), y+height-(s/2));
        gc2d.strokeLine(x+(s/2), y+height-(s/2), x+(s/2), y+(s/2));
    }
}
