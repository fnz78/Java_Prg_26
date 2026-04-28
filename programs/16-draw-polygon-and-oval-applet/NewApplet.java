package javaapplication18;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class NewApplet extends Applet {

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        int x[] = {120, 220, 30};
        int y[] = {30, 220, 220};
        int p = 3;

        g.setColor(Color.YELLOW);
        g.fillPolygon(x, y, p);

        g.setColor(Color.PINK);
        g.fillOval(90, 120, 70, 70);
    }
}
