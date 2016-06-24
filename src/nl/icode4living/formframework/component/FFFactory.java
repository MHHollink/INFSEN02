package nl.icode4living.formframework.component;

import nl.icode4living.formframework.component.factory.DefaultButtonFactory;
import nl.icode4living.formframework.component.factory.FlickeringButtonFactory;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 24-6-2016.
 */
public class FFFactory {

    FlickeringButtonFactory flickerButtonFactory;
    DefaultButtonFactory defaultButtonFactory;

    public FFFactory() {
        this.defaultButtonFactory = new DefaultButtonFactory();
        this.flickerButtonFactory = new FlickeringButtonFactory();
    }

    public DefaultButtonFactory getDefaultButtonFactory() {
        return defaultButtonFactory;
    }

    public FlickeringButtonFactory getFlickerButtonFactory() {
        return flickerButtonFactory;
    }





}
