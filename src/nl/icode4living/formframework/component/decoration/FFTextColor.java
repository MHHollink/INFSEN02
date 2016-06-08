package nl.icode4living.formframework.component.decoration;

import com.sun.javafx.tk.Toolkit;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.TextAlignment;
import nl.icode4living.formframework.component.FFComponent;



/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class FFTextColor extends FFDecoration {

    private Color c;
    private Double s;

    public FFTextColor(FFComponent temp, Color c, Double s) {
        super(temp);
        this.c = c;
        this.s = s;
    }

    @Override
    public void draw(GraphicsContext gc2d) {
        super.draw(gc2d);
        System.out.println("textcolor");
        gc2d.setFill(c != null ? c : Color.BLACK);
        gc2d.setFont(s != null ? new Font(s) : new Font(16));
        gc2d.setFontSmoothingType(FontSmoothingType.LCD);
        gc2d.setTextAlign(TextAlignment.CENTER);
        gc2d.fillText(
                super.getText(),
                super.getX()+(super.getWidth()/2),
                super.getY()+(super.getHeight()/2) +
                        Toolkit.getToolkit().getFontLoader().getFontMetrics(gc2d.getFont()).getLineHeight()/2
        );
    }

}
