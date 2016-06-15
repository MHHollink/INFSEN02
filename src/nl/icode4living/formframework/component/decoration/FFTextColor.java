package nl.icode4living.formframework.component.decoration;

import nl.icode4living.formframework.component.FFComponent;

import java.awt.*;


/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 01-6-2016.
 */
public class FFTextColor extends FFDecoration {

    private Color c;
    private Integer s;

    public FFTextColor(FFComponent temp, Color c, Integer s) {
        super(temp);
        this.c = c;
        this.s = s;
    }

    @Override
    public void draw(Graphics2D gc2d) {
        super.draw(gc2d);
        gc2d.setColor(c != null ? c : Color.BLACK);
        gc2d.setFont(s != null ? new Font("arial", Font.PLAIN, s) : new Font("arial", Font.PLAIN, 16));
        drawCenteredString(getText(), getWidth(), getHeight(), gc2d);
    }

    public void drawCenteredString(String s, int w, int h, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        int x = (w - fm.stringWidth(s)) / 2 + getX();
        int y = (fm.getAscent() + (h - (fm.getAscent() + fm.getDescent())) / 2) + getY();
        g.drawString(s, x, y);
    }
}
