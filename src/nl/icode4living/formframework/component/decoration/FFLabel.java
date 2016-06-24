package nl.icode4living.formframework.component.decoration;

import nl.icode4living.formframework.component.FFComponent;
import nl.icode4living.formframework.component.observer.FFOnEnterListener;
import nl.icode4living.formframework.util.TextUtil;

import java.awt.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 15-6-2016.
 */
public class FFLabel extends FFDecoration {

    public FFLabel(FFComponent temp) {
        super(temp);
    }

    @Override
    public void draw(Graphics2D gc2d) {
        super.draw(gc2d);
        gc2d.setFont(new Font("arial", Font.PLAIN, 16));
        TextUtil.drawCenteredString(getText(), getWidth(), getHeight(), getX(), getY(), gc2d);
    }
}
