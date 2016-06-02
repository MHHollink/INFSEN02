package nl.icode4living.formframework.component;

import nl.icode4living.formframework.component.observer.FFOnClickListener;

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

    private FFOnClickListener onClickListener;

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
    public void setOnClickListener(FFOnClickListener listener) {
        this.onClickListener = listener;
    }

    @Override
    public void removeOnClickListener() {
        this.onClickListener = null;
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
}