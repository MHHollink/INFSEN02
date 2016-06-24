package nl.icode4living.formframework.component;

import javax.swing.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 15-6-2016.
 */
public class FFWindow {

    private JFrame frame;
    private FFDrawingPane panel;

    public FFWindow(int width, int height, String title) {

        frame = new JFrame(title);
        panel = new FFDrawingPane(width, height);

        frame.setContentPane(panel);
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public FFDrawingPane getDrawingPane() {
        return panel;
    }
}
