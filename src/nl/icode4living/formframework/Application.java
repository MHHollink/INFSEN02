package nl.icode4living.formframework;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import nl.icode4living.formframework.component.FFBase;
import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.decoration.FFBackground;
import nl.icode4living.formframework.component.decoration.FFBorderColor;
import nl.icode4living.formframework.component.decoration.FFTextColor;

import java.util.Random;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class Application extends javafx.application.Application {

    public static final int WIDTH = 900;
    public static final int HEIGHT = WIDTH * 9 / 16;

    public static void main(String[] args) {
        launch(Application.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc2d = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();
        primaryStage.show();

        FFComponent button = new FFBorderColor(
                new FFTextColor(
                        new FFBackground(
                                new FFBase("Hello Button", 50, 50, 500, 200),
                                Color.WHITESMOKE
                        ),
                        Color.GREEN, 27.0
                ), Color.YELLOW, 7.0
        );
        button.setOnClickListener(() -> {
            new FFBorderColor(button,
                    Color.color(
                            new Random().nextDouble(),
                            new Random().nextDouble(),
                            new Random().nextDouble()
                    )
                    , 8.0).draw(gc2d);
        });
        button.draw(gc2d);

        canvas.addEventHandler(MouseEvent.MOUSE_CLICKED, button);
    }
}
