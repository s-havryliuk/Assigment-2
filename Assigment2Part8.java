import com.shpp.cs.a.console.TextProgram;

public class Assigment2Part8 extends TextProgram {
    public void run() {
        println("Давай зіграємо в Fizz Bazz Buzz!");
        int number = readInt("Введи число:");
        for (int i = 0; i <= number; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                println(i);
            }
            if (i % 3 == 0 && i % 5 != 0) {
                println("Fizz");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                println("Bazz");
            }
            if (i % 5 == 0 && i % 3 == 0) {
                println("Buzz");
            }
        }
    }
}