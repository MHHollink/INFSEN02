package nl.icode4living.formframework;

import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.FFWindow;
import nl.icode4living.formframework.component.factory.CustomButtonFactory;
import nl.icode4living.formframework.component.factory.FlickeringButtonFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class Application {

    public static final int WIDTH = 900;
    public static final int HEIGHT = WIDTH * 9 / 16;

    public static void main(String[] args) {
        new Application();
    }

    public Application() {
        FFWindow window = new FFWindow(WIDTH, HEIGHT, "Panel");

        Map<String, String> buttonProps = new HashMap<>();

        buttonProps.put(CustomButtonFactory.Properties.TEXT_COLOR, "red");
        buttonProps.put(CustomButtonFactory.Properties.TEXT_SIZE, "29");
        buttonProps.put(CustomButtonFactory.Properties.BORDER_COLOR, "red");
        buttonProps.put(CustomButtonFactory.Properties.BORDER_SIZE, "8");

        FFComponent component = new FlickeringButtonFactory()
                .construct("Click Me!",
                        200, 50, // X, Y
                        250, 100,// Width, Height
                        3, // Flicker speed
                        (e, s) -> {
                            System.out.println("clicked!");
                        },
                        (e, s) -> {
                            Random r = new Random();
                            s.setX(r.nextInt(window.getDrawingPane().getWidth() - s.getWidth()));
                            s.setY(r.nextInt(window.getDrawingPane().getHeight() - s.getHeight()));
                        }
                );

        window.getDrawingPane().addComponents(component);
    }
}
