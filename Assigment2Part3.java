import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assigment2Part3 extends WindowProgram {
    static final double FIRST_TOE_OFFSET_X = 0;
    static final double FIRST_TOE_OFFSET_Y = 20;
    static final double SECOND_TOE_OFFSET_X = 30;
    static final double SECOND_TOE_OFFSET_Y = 0;
    static final double THIRD_TOE_OFFSET_X = 60;
    static final double THIRD_TOE_OFFSET_Y = 20;

    static final double HEEL_OFFSET_X = 20;
    static final double HEEL_OFFSET_Y = 40;

    static final double TOE_WIDTH = 20;
    static final double TOE_HEIGHT = 30;

    static final double HEEL_WIDTH = 40;
    static final double HEEL_HEIGHT = 60;

    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    public void run() {
        double x;
        double y;
        drawPaw(20, 20);
        drawPaw(180, 70);
    }

    void drawPaw(double x, double y) {
        GOval toe1 = new GOval(
                FIRST_TOE_OFFSET_X + x,
                FIRST_TOE_OFFSET_Y + y,
                TOE_WIDTH, TOE_HEIGHT);
        toe1.setFilled(true);
        toe1.setFillColor(Color.BLACK);
        add(toe1);
        GOval toe2 = new GOval(
                SECOND_TOE_OFFSET_X + x,
                SECOND_TOE_OFFSET_Y + y,
                TOE_WIDTH, TOE_HEIGHT);
        toe2.setFilled(true);
        toe2.setFillColor(Color.BLACK);
        add(toe2);

        GOval toe3 = new GOval(
                THIRD_TOE_OFFSET_X + x,
                THIRD_TOE_OFFSET_Y + y,
                TOE_WIDTH, TOE_HEIGHT);
        toe3.setFilled(true);
        toe3.setFillColor(Color.BLACK);
        add(toe3);
        GOval heel = new GOval(
                HEEL_OFFSET_X + x,
                HEEL_OFFSET_Y + y,
                HEEL_WIDTH, HEEL_HEIGHT);
        heel.setFilled(true);
        heel.setFillColor(Color.BLACK);
        add(heel);
    }
}

