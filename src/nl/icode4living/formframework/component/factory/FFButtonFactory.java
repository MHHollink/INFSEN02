package nl.icode4living.formframework.component.factory;

import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.observer.FFOnClickListener;
import nl.icode4living.formframework.component.observer.FFOnEnterListener;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 24-6-2016.
 */
public interface FFButtonFactory {
    FFComponent construct(String text, int x, int y, int w, int h);
    FFComponent construct(String text, int x, int y, int w, int h, FFOnClickListener l);
    FFComponent construct(String text, int x, int y, int w, int h, FFOnEnterListener l);
    FFComponent construct(String text, int x, int y, int w, int h, FFOnClickListener la, FFOnEnterListener lb);
}
