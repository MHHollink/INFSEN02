package nl.icode4living.formframework.component.factory;

import nl.icode4living.formframework.component.FFBase;
import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.decoration.FFBackgroundColored;
import nl.icode4living.formframework.component.decoration.FFBorderColor;
import nl.icode4living.formframework.component.decoration.FFTextColor;
import nl.icode4living.formframework.component.observer.FFOnClickListener;
import nl.icode4living.formframework.component.observer.FFOnEnterListener;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.Map;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 24-6-2016.
 */
public class CustomButtonFactory implements FFButtonFactory{

    public class Properties {
        public static final String BACKGROUND = "background";
        public static final String TEXT_COLOR = "txt_color";
        public static final String TEXT_SIZE = "txt_size";
        public static final String BORDER_COLOR = "brdr_color";
        public static final String BORDER_SIZE= "brdr_size";
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h) {
        return new FFBase(text, x, y, w, h);
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h, FFOnClickListener l) {
        FFComponent base = construct(text, x, y, w, h);
        base.setOnClickListener(l);
        return base;
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h, FFOnEnterListener l) {
        FFComponent base = construct(text, x, y, w, h);
        base.setOnMouseEnterListener(l);
        return base;
    }

    @Override
    public FFComponent construct(String text, int x, int y, int w, int h, FFOnClickListener la, FFOnEnterListener lb) {
        FFComponent base = construct(text, x, y, w, h);
        base.setOnClickListener(la);
        base.setOnMouseEnterListener(lb);
        return base;
    }

    public FFComponent construct(String text, int x, int y, int w, int h, Map<String, String> properties) {
        FFComponent base = construct(text, x, y, w, h);

        if(properties.containsKey(Properties.BACKGROUND)) {
            Color background = null;
            try {
                Field field = Class.forName("java.awt.Color").getField(properties.get(Properties.BACKGROUND));
                background = (Color) field.get(null);
            } catch (NoSuchFieldException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            base = new FFBackgroundColored(base, background != null ? background : Color.LIGHT_GRAY);
        }

        if(properties.containsKey(Properties.TEXT_COLOR)) {

            int fontSize = 12;
            Color textColor = null;
            try {
                Field field = Class.forName("java.awt.Color").getField(properties.get(Properties.TEXT_COLOR));
                textColor = (Color) field.get(null);
            } catch (NoSuchFieldException | IllegalAccessException | ClassNotFoundException e) {
                System.out.printf("%s is not a valid text color \n", properties.get(Properties.TEXT_COLOR));
            }

            try {
                fontSize = properties.containsKey(Properties.TEXT_SIZE) ? Integer.parseInt(properties.get(Properties.TEXT_SIZE)) : fontSize;
            } catch (Exception e) {
                System.out.printf("%s is not a valid font size \n", properties.get(Properties.TEXT_SIZE));
            }

            base = new FFTextColor(base, textColor != null ? textColor : Color.BLACK, fontSize);
        }

        if(properties.containsKey(Properties.BORDER_COLOR)) {
            Color borderColor = null;
            try {
                Field field = Class.forName("java.awt.Color").getField(properties.get(Properties.BORDER_COLOR));
                borderColor = (Color) field.get(null);
            } catch (NoSuchFieldException | IllegalAccessException | ClassNotFoundException e) {
                System.out.printf("%s is not a valid border color \n", properties.get(Properties.BORDER_COLOR));
            }

            int borderSize = 1;
            try {
                borderSize = properties.containsKey(Properties.BORDER_SIZE) ? Integer.parseInt(properties.get(Properties.BORDER_SIZE)) : borderSize;
            } catch (Exception e) {
                System.out.printf("%s is not a valid border size \n", properties.get(Properties.BORDER_SIZE));
            }

            base = new FFBorderColor(base, borderColor != null ? borderColor : Color.BLACK, borderSize);
        }

        return base;
    }

    public FFComponent construct(String text, int x, int y, int w, int h, Map<String, String> properties, FFOnClickListener listener) {
        FFComponent base = construct(text, x, y, w, h, properties);
        base.setOnClickListener(listener);
        return base;
    }

    public FFComponent construct(String text, int x, int y, int w, int h, Map<String, String> properties, FFOnEnterListener listener) {
        FFComponent base = construct(text, x, y, w, h, properties);
        base.setOnMouseEnterListener(listener);
        return base;
    }

    public FFComponent construct(String text, int x, int y, int w, int h, Map<String, String> properties, FFOnClickListener la, FFOnEnterListener lb) {
        FFComponent base = construct(text, x, y, w, h, properties);
        base.setOnClickListener(la);
        base.setOnMouseEnterListener(lb);
        return base;
    }
}
