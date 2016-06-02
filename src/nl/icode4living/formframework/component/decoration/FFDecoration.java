package nl.icode4living.formframework.component.decoration;

import javafx.scene.canvas.GraphicsContext;
import nl.icode4living.formframework.component.AbsFFComponent;
import nl.icode4living.formframework.component.FFComponent;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public abstract class FFDecoration<T extends FFComponent> extends AbsFFComponent {
    private T temp;

    public FFDecoration(T temp) {
        this.temp = temp;
    }

    @Override
    public void draw(GraphicsContext gc2d) {
        temp.draw(gc2d);
    }
}
