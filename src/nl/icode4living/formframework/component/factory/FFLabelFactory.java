package nl.icode4living.formframework.component.factory;

import nl.icode4living.formframework.component.FFBase;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 24-6-2016.
 */
public interface FFLabelFactory {
    FFBase construct(String text);
    FFBase construct(String text, int w, int h, int x, int y);
}
