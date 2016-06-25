package nl.icode4living.formframework.util;

import java.awt.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 15-6-2016.
 */
public class TextUtil {
    public static void drawCenteredString(String s, int w, int h, int x, int y, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        x = (w - fm.stringWidth(s)) / 2 + x;
        y = (fm.getAscent() + (h - (fm.getAscent() + fm.getDescent())) / 2) + y;
        g.drawString(s, x, y);
    }
}
