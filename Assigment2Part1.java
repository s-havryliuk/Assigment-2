import com.shpp.cs.a.console.TextProgram;

public class Assigment2Part1 extends TextProgram {
    public void run() {
        double a = readInt("Please enter a:");
        double b = readInt("Please enter b:");
        double c = readInt("Please enter c:");

        double d;
        double x1;
        double x2;
        println("Please enter a:" + a);
        println("Please enter b:" + b);
        println("Please enter c:" + c);

        d = (double) Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            println("There are two roots: " + x1 + " and " + x2);
        }
        if (d == 0) {
            x1 = -b / (2 * a);
            println("There is one root: " + x1);
        }
        if (d < 0) {
            println("There are no real roots");
        }
    }
}
