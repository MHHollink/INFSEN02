package nl.icode4living.formframework.component;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 31-5-2016.
 */
public class FFButton extends FFLabel {

    public FFButton(String text) {
        super(text);
    }

    public FFButton() {
    }

    @Override
    public void draw(GraphicsContext gc2d) {
        super.draw(gc2d);

        int x,y,width,height;
        x = getX();
        y = getY();
        width = getWidth();
        height = getHeight();

        gc2d.setFill(Color.GRAY);
        gc2d.fillRect(x, y, width, height);
    }
}
