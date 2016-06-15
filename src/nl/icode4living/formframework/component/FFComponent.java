package nl.icode4living.formframework.component;

import nl.icode4living.formframework.component.observer.FFOnClickListener;

import java.awt.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public interface FFComponent extends FFOnClickListener {

    void draw(Graphics2D gc2d);

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

    FFComponent getComponent();
    void setComponent(FFComponent component);
}
