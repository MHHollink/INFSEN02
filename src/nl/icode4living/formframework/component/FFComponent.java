package nl.icode4living.formframework.component;

import javafx.scene.canvas.GraphicsContext;
import nl.icode4living.formframework.component.observer.FFOnClickListener;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public interface FFComponent {

    void draw(GraphicsContext gc2d);

    void setOnClickListener(FFOnClickListener listener);
    void removeOnClickListener();

    FFComponent setText(String text);
    String getText();

    FFComponent setX(int x);
    int getX();

    FFComponent setY(int y);
    int getY();

    FFComponent setWidth(int width);
    int getWidth();

    FFComponent setHeight(int height);
    int getHeight();
}
