package nl.icode4living.formframework.component.decoration;

import nl.icode4living.formframework.component.AbsFFComponent;
import nl.icode4living.formframework.component.FFComponent;

import java.awt.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public abstract class FFDecoration extends AbsFFComponent {
    private FFComponent temp;

    public FFDecoration(FFComponent temp) {
        this.temp = temp;
    }

    @Override
    public void draw(Graphics2D gc2d) {
        temp.draw(gc2d);
    }

    @Override
    public FFComponent setHeight(int height) {
        return temp.setHeight(height);
    }

    @Override
    public FFComponent setWidth(int width) {
        return temp.setWidth(width);
    }

    @Override
    public FFComponent setX(int x) {
        return temp.setX(x);
    }

    @Override
    public FFComponent setY(int y) {
        return temp.setY(y);
    }

    @Override
    public FFComponent setText(String text) {
        return temp.setText(text);
    }

    @Override
    public String getText() {
        return temp.getText();
    }

    @Override
    public int getWidth() {
        return temp.getWidth();
    }

    @Override
    public int getHeight() {
        return temp.getHeight();
    }

    @Override
    public int getX() {
        return temp.getX();
    }

    @Override
    public int getY() {
        return temp.getY();
    }

    public void setComponent(FFComponent component) {
        component.setComponent(temp);
        temp = component;
    }
}
