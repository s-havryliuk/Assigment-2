import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assigment2Part6 extends WindowProgram {
    /* The size of one caterpillar segment */
    private static final double SEGMENT_DIAMETER = 50;
    /* Distance between odd segments */
    private static final double SEGMENT_SPACING = 1.5;
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 400;

    public void run() {
        drawCaterpillar(8, 50, 50);
    }

    private void drawCaterpillar(int number, double x, double y) {
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                GOval segment1 = new GOval(x + (i * (SEGMENT_DIAMETER / 2 + SEGMENT_SPACING)),
                        y + SEGMENT_DIAMETER / 2, SEGMENT_DIAMETER, SEGMENT_DIAMETER);
                segment1.setColor(Color.YELLOW);
                segment1.setFilled(true);
                segment1.setFillColor(Color.GREEN);
                add(segment1);
            } else {
                GOval segment = new GOval(x + (i * SEGMENT_DIAMETER / 2), y, SEGMENT_DIAMETER, SEGMENT_DIAMETER);
                segment.setColor(Color.YELLOW);
                segment.setFilled(true);
                segment.setFillColor(Color.GREEN);
                add(segment);
            }
        }
    }
}

