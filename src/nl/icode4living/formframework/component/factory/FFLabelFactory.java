package nl.icode4living.formframework.component.factory;

import nl.icode4living.formframework.component.FFComponent;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 24-6-2016.
 */
public interface FFLabelFactory {
    FFComponent construct(String text, int x, int y);
    FFComponent construct(String text, int x, int y, int w, int h);
}
