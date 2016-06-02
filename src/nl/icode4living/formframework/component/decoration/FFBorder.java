package nl.icode4living.formframework.component.decoration;

import javafx.scene.canvas.GraphicsContext;
import nl.icode4living.formframework.component.FFComponent;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class FFBorder<T extends FFComponent> extends FFDecoration<T> {

    public FFBorder(T temp) {
        super(temp);
    }

    @Override
    public void draw(GraphicsContext gc2d) {
        super.draw(gc2d);

        double x,y,width,height;
        x = getX()+0.5;
        y = getY()+0.5;
        width = getWidth()-1;
        height = getHeight()-1;

        double lineWidth = 2;

        gc2d.setLineWidth(lineWidth);
        gc2d.strokeLine(x+(lineWidth/2), y+(lineWidth/2), x+width-(lineWidth/2), y+(lineWidth/2));
        gc2d.strokeLine(x+width-(lineWidth/2), y+(lineWidth/2), x+width-(lineWidth/2), y+height-(lineWidth/2));
        gc2d.strokeLine(x+(lineWidth/2), y+height-(lineWidth/2), x+width-(lineWidth/2), y+height-(lineWidth/2));
        gc2d.strokeLine(x+(lineWidth/2), y+height-(lineWidth/2), x+(lineWidth/2), y+(lineWidth/2));
    }

}
