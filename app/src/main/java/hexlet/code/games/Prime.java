package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final Random RANDOM = new Random();

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (var i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void run() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        var task = new String[Engine.ROUNDS_COUNT][2];
        for (var round : task) {
            var currentNumber = RANDOM.nextInt(100) + 2;
            round[0] = Integer.toString(currentNumber);
            round[1] = (isPrime(currentNumber) ? "yes" : "no");
        }

        Engine.run(description, task);
    }
}
