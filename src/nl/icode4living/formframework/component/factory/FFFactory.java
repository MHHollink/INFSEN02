package nl.icode4living.formframework.component.factory;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 24-6-2016.
 */
public class FFFactory {

    private static FFFactory instance = null;

    public static FFFactory getInstance() {
        return (instance = (instance != null) ? instance : new FFFactory());
    }


    CustomButtonFactory customButtonFactory;
    FlickeringButtonFactory flickerButtonFactory;
    DefaultButtonFactory defaultButtonFactory;
    DefaultLabelFactory defaultLabelFactory;

    private FFFactory() {
        this.defaultButtonFactory = new DefaultButtonFactory();
        this.flickerButtonFactory = new FlickeringButtonFactory();
        this.customButtonFactory = new CustomButtonFactory();
        this.defaultLabelFactory = new DefaultLabelFactory();
    }

    public DefaultButtonFactory getDefaultButtonFactory() {
        return defaultButtonFactory;
    }

    public FlickeringButtonFactory getFlickerButtonFactory() {
        return flickerButtonFactory;
    }

    public CustomButtonFactory getCustomButtonFactory() {
        return customButtonFactory;
    }

    public DefaultLabelFactory getDefaultLabelFactory() {
        return defaultLabelFactory;
    }
}
