import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;


public class Assigment2Part4 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;


    public void run() {
        drawFlag(200, 150, 3, Color.RED, Color.WHITE, Color.RED);
        drawText("Flag of Austria");
    }

    /* Draws a striped flag. Its width, height, number of stripes, and colors are all parameters. */
    private void drawFlag(int FLAG_WIDTH, int FLAG_HEIGHT, int NUMBER_STRIPE, Color... colors) {
        final int FLAG_OFFSET_X = (getWidth() / 2) - (FLAG_WIDTH / 2);
        final int FLAG_OFFSET_Y = (getHeight() / 2) - (FLAG_HEIGHT / 2);
        for (int i = 0; NUMBER_STRIPE > i; i++) {
            GRect stripe1 = new GRect(FLAG_OFFSET_X, FLAG_OFFSET_Y + (FLAG_HEIGHT / NUMBER_STRIPE) * i,
                    FLAG_WIDTH, FLAG_HEIGHT / NUMBER_STRIPE);
            stripe1.setFilled(true);
            stripe1.setFillColor(colors[i]);
            stripe1.setColor(colors[i]);
            add(stripe1);
        }
    }

    private void drawText(String flagOfCountry) {
        double size = flagOfCountry.length();
        final double TEXT_OFFSET_X = getWidth() - (size * 15) / 2;
        final double TEXT_OFFSET_Y = getHeight() - size;
        GLabel country = new GLabel(flagOfCountry, TEXT_OFFSET_X, TEXT_OFFSET_Y);
        country.setFont("Verdana-15");
        add(country);
    }
}
