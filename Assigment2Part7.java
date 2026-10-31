import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assigment2Part7 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;

    public static final double ROBOT_OFFSET_X = APPLICATION_WIDTH / 3;
    public static final double ROBOT_OFFSET_Y = APPLICATION_HEIGHT / 4;

    public static final double HEAD_WIDTH = APPLICATION_WIDTH / 3;
    public static final double HEAD_HEIGHT = APPLICATION_HEIGHT / 2;
    public static final double MOUTH_WIDTH = 50;
    public static final double MOUTH_HEIGHT = 25;
    public static final double EYE_RADIUS = 15;

    public void run() {
        drawRobotsFace();
    }

    private void drawRobotsFace() {
        drawRobotsHead();
        drawRobotsEyes();
        drawRobotsMouth();
    }

    private void drawRobotsEyes() {
        for (int i = 0; i < 2; i++) {
            GOval eye = new GOval(ROBOT_OFFSET_X + HEAD_WIDTH / 4 + (i * 80),
                    ROBOT_OFFSET_Y + HEAD_HEIGHT / 4, EYE_RADIUS, EYE_RADIUS);
            eye.setColor(Color.BLACK);
            eye.setFilled(true);
            eye.setFillColor(Color.BLACK);
            add(eye);
        }
    }

    private void drawRobotsMouth() {
        GRect mouth = new GRect(ROBOT_OFFSET_X + HEAD_WIDTH / 2 - MOUTH_WIDTH / 2,
                ROBOT_OFFSET_Y + (HEAD_HEIGHT * 3 / 4), MOUTH_WIDTH, MOUTH_HEIGHT);
        mouth.setColor(Color.BLACK);
        mouth.setFilled(true);
        mouth.setFillColor(Color.RED);
        add(mouth);
    }

    private void drawRobotsHead() {
        GRect head = new GRect(ROBOT_OFFSET_X, ROBOT_OFFSET_Y, HEAD_WIDTH, HEAD_HEIGHT);
        head.setColor(Color.BLACK);
        head.setFilled(true);
        head.setFillColor(Color.LIGHT_GRAY);
        add(head);
    }
}
