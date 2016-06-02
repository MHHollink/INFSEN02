package nl.icode4living.formframework;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import nl.icode4living.formframework.component.FFButton;
import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.decoration.FFBorderColor;
import nl.icode4living.formframework.component.decoration.FFTextColor;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class Application extends javafx.application.Application {

    public static final int WIDTH = 900;
    public static final int HEIGHT = WIDTH * 9/16;
    public static void main(String[] args) {
        launch(Application.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Canvas canvas = new Canvas(WIDTH,HEIGHT);
        GraphicsContext gc2d = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();
        primaryStage.show();

        FFComponent button = new FFBorderColor<FFTextColor>(new FFTextColor<>(new FFButton("Hello Button"), Color.RED), Color.YELLOW)
                .setHeight(50).setWidth(100).setX(20).setY(20);
        button.draw(gc2d);

    }

}
