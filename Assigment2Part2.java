import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assigment2Part2 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;

    public void run() {
        final int CIRCLE_DIAMETER = 100;
        final int CIRCLE_RADIUS = 50;

        GOval circle1 = new GOval(0, 0, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
        circle1.setFilled(true);
        circle1.setFillColor(Color.BLACK);
        add(circle1);

        GOval circle2 = new GOval(0, getHeight() - CIRCLE_DIAMETER, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
        circle2.setFilled(true);
        circle2.setFillColor(Color.BLACK);
        add(circle2);

        GOval circle3 = new GOval
                (getWidth() - CIRCLE_DIAMETER, getHeight() - CIRCLE_DIAMETER,
                        CIRCLE_DIAMETER, CIRCLE_DIAMETER);
        circle3.setFilled(true);
        circle3.setFillColor(Color.BLACK);
        add(circle3);

        GOval circle4 = new GOval(getWidth() - CIRCLE_DIAMETER, 0, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
        circle4.setFilled(true);
        circle4.setFillColor(Color.BLACK);
        add(circle4);

        GRect rectangle = new GRect(CIRCLE_RADIUS, CIRCLE_RADIUS, 180, 150);
        rectangle.setFilled(true);
        rectangle.setColor(Color.WHITE);
        rectangle.setFillColor(Color.WHITE);
        add(rectangle);
    }
}
