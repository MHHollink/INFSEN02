package nl.icode4living.formframework;

import nl.icode4living.formframework.component.FFBase;
import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.FFScreen;
import nl.icode4living.formframework.component.decoration.FFBackground;
import nl.icode4living.formframework.component.decoration.FFBorderColor;
import nl.icode4living.formframework.component.decoration.FFTextColor;

import java.awt.*;

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

        FFScreen screen = new FFScreen(WIDTH, HEIGHT, "Panel");

        FFComponent component = new FFTextColor(
                new FFBackground(
                        new FFBase("HelloWorld", 50, 50, 250, 100),
                        Color.CYAN
                ),
                Color.GREEN,
                24
        );
        component.setOnClickListener((e) -> System.out.println("Ello World"));

        FFComponent com = new FFTextColor(
                new FFBorderColor(



                new FFBackground(
                        new FFBase("Fucking hell, this is gay!", 400, 200, 200, 200),
                        Color.pink
                ),
                Color.RED,
                5
                ),
                Color.YELLOW,
                24
        );


        screen.getDrawingPane().addComponents(component, com);
    }
}
