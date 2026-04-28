package javaapplication20;

import java.awt.*;
import java.awt.event.*;

public class AllEventsExample extends Frame
        implements KeyListener, MouseListener, MouseMotionListener {

    String msg = "";
    int mouseX = 100, mouseY = 100;

    public AllEventsExample() {
        setSize(600, 400);
        setTitle("All Mouse and Keyboard Events with Coordinates");
        setVisible(true);

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // ---------------- Key Events ----------------

    @Override
    public void keyPressed(KeyEvent e) {
        msg = "Key Pressed: " + e.getKeyChar() +
              " at (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        msg = "Key Released: " + e.getKeyChar() +
              " at (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        msg = "Key Typed: " + e.getKeyChar() +
              " at (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    // ---------------- Mouse Events ----------------

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Clicked at (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Pressed at (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Released at (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Entered at (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited Window";
        repaint();
    }

    // ---------------- Mouse Motion Events ----------------

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Dragged at (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Mouse Moved at (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    // ---------------- Paint Method ----------------

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }

    // ---------------- Main Method ----------------

    public static void main(String[] args) {
        new AllEventsExample();
    }
} 
