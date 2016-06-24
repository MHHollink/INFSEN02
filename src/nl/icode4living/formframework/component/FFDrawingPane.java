package nl.icode4living.formframework.component;

import nl.icode4living.formframework.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TODO: Write class level documentation
 *
 * @author Marcel
 * @since 15-6-2016.
 */
public class FFDrawingPane extends JPanel implements Runnable, MouseListener{

    // drawing loop
    private Thread thread;
    private boolean running;
    private int FPS = 60;
    private long targetTime = 1000/FPS;

    // image
    private BufferedImage image;
    private Graphics2D g;

    // components
    private List<FFComponent> components;

    public FFDrawingPane(int width, int height) {
        setPreferredSize(new Dimension(width, height));
        running = true;
    }

    public void addNotify() {
        super.addNotify();
        if(thread == null){
            thread = new Thread(this);
            addMouseListener(this);
            thread.start();
        }
    }

    public void addComponents(FFComponent... component) {
        if (components == null) {
            components = new ArrayList<>();
        }
        Collections.addAll(components, component);
    }

    public void run() {
        init();
        long start, elapsed, wait;
        while(running){
            start = System.nanoTime();
            update();
            draw();
            drawToScreen();
            elapsed = System.nanoTime() - start;
            wait = targetTime - elapsed / 1000000;
            if( wait < 0) wait = 5;
            try {
                Thread.sleep(wait);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        components.forEach(component -> component.onMouseEnter(getMousePosition(), component));
    }

    private void init() {
        image = new BufferedImage(
                getWidth() != 0 ? getWidth() : Application.WIDTH,
                getHeight()!= 0 ? getHeight(): Application.HEIGHT,
                BufferedImage.TYPE_INT_RGB
        );
        g = (Graphics2D) image.getGraphics();
        components = new ArrayList<>();
    }

    private void draw() {
        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(),getHeight());
        components.forEach( (c) -> c.draw(g) );
    }

    private void drawToScreen() {
        Graphics g2 = getGraphics();
        g2.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        g2.dispose();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        components.forEach(component -> component.onClick(e.getPoint(), component));
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
}
