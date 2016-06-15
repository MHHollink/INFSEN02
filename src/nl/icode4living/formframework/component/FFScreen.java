package nl.icode4living.formframework.component;

import javax.swing.*;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 15-6-2016.
 */
public class FFScreen {

    private JFrame frame;
    private FFPanel panel;

    public FFScreen(int width, int height, String title) {

        frame = new JFrame(title);
        panel = new FFPanel(width, height);

        frame.setContentPane(panel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public FFPanel getDrawingPane() {
        return panel;
    }
}
