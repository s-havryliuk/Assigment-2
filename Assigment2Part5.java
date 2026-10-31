import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;


public class Assigment2Part5 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 400;
    /* The number of rows and columns in the grid, respectively. */
    private static final double NUM_ROWS = 5;
    private static final double NUM_COLS = 6;
    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;
    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    public void run() {
        drawMatrixOfBoxes();
    }

    /* Creates a matrix of black boxes. Size is 5*6. */
    private void drawMatrixOfBoxes() {
        final double MATRIX_POSITION_ON_X = getWidth() / 2 - (NUM_COLS * BOX_SIZE + NUM_COLS * BOX_SPACING) / 2;
        final double MATRIX_POSITION_ON_Y = getHeight() / 2 - (NUM_ROWS * BOX_SIZE + NUM_ROWS * BOX_SPACING) / 2;
        for (int j = 0; j < NUM_ROWS; j++) {
            for (int i = 0; i < NUM_COLS; i++) {
                GRect box = new GRect(
                        MATRIX_POSITION_ON_X + (i * BOX_SIZE) + (i * BOX_SPACING),
                        MATRIX_POSITION_ON_Y + (j * BOX_SIZE) + (j * BOX_SPACING),
                        BOX_SIZE,
                        BOX_SIZE);
                box.setFilled(true);
                box.setFillColor(Color.BLACK);
                add(box);
            }
        }
    }
}
