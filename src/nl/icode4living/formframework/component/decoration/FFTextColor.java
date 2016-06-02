package nl.icode4living.formframework.component.decoration;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import nl.icode4living.formframework.component.FFComponent;



/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class FFTextColor<T extends FFComponent> extends FFDecoration<T> {

    Color c;

    public FFTextColor(T temp, Color c) {
        super(temp);
        this.c = c;
    }

    @Override
    public void draw(GraphicsContext gc2d) {
        super.draw(gc2d);
        gc2d.setFill(c);
        gc2d.setTextAlign(TextAlignment.CENTER);
        gc2d.fillText(
                getText(),
                getX()+(getWidth()/2),
                getY()+(getHeight()/2)
        );
    }

}
