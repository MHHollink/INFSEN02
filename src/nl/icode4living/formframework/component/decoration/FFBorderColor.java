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
public class FFBorderColor<T extends FFComponent> extends FFDecoration<T> {

    Color c;

    public FFBorderColor(T temp, Color c) {
        super(temp);
        this.c = c;
    }

    @Override
    public void draw(GraphicsContext gc2d) {
        super.draw(gc2d);
    }
}
