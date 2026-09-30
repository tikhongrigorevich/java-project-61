package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    private static final Random RANDOM = new Random();

    private static int gcd(int a, int b) {
        while (b != 0) {
            var temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void run() {
        String description = "Find the greatest common divisor of given numbers.";

        var task = new String[3][2];
        for (var round : task) {

            int number1 = RANDOM.nextInt(100);
            int number2 = RANDOM.nextInt(100);

            round[0] = number1 + " " + number2;
            round[1] = Integer.toString(gcd(number1, number2));
        }

        Engine.run(description, task);
    }
}
