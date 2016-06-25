package nl.icode4living.formframework.component;

import nl.icode4living.formframework.component.observer.FFOnClickListener;
import nl.icode4living.formframework.component.observer.FFOnEnterListener;

import java.awt.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public abstract class AbsFFComponent implements FFComponent {

    private int width;
    private int height;
    private int x;
    private int y;
    private String text;

    private boolean entered;

    private FFOnClickListener onClickListener;
    private FFOnEnterListener onEnterListener;



    @Override
    public FFComponent setWidth(int width) {
        this.width = width;
        return this;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public FFComponent setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void draw(Graphics2D gc2d) {

    }

    @Override
    public void setOnClickListener(FFOnClickListener listener) {
        this.onClickListener = listener;
    }

    @Override
    public void removeOnClickListener() {
        this.onClickListener = null;
    }

    @Override
    public void setOnMouseEnterListener(FFOnEnterListener listener) {
        onEnterListener = listener;
    }

    @Override
    public void removeOnMouseEnterListener() {
        onClickListener = null;
    }

    @Override
    public FFComponent setX(int x) {
        this.x = x;
        return this;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public FFComponent setY(int y) {
        this.y = y;
        return this;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public FFComponent setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public String getText() {
        return text;
    }

    public FFComponent getComponent() {
        return this;
    }

    @Override
    public void setComponent(FFComponent component) {

    }

    @Override
    public void onClick(Point event, FFComponent self) {
        if( event != null && (event.getX() >= getX() && event.getX() <= getX()+getWidth()) && (event.getY() >= getY() && event.getY() <= getY()+getHeight()) && onClickListener != null)
            onClickListener.onClick(event, self);
    }

    @Override
    public void onMouseEnter(Point event, FFComponent self) {
        if (event != null) {
            if (
                    ((event.getX() >= getX() && event.getX() <= getX() + getWidth()) &&
                            (event.getY() >= getY() && event.getY() <= getY() + getHeight())) &&
                            onEnterListener != null &&
                            !entered) {
                entered = true;
                onEnterListener.onMouseEnter(event, self);
            } else if (!((event.getX() >= getX() && event.getX() <= getX() + getWidth()) &&
                    (event.getY() >= getY() && event.getY() <= getY() + getHeight()))) {
                entered = false;
            }
        }
    }
}
