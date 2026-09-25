package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String YES = "yes";
    private static final String NO = "no";

    private static String isPrime(int number) {
        if (number < 2) {
            return NO;
        }
        if (number == 2) {
            return YES;
        }
        if (number % 2 == 0) {
            return NO;
        }
        for (var i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return NO;
            }
        }
        return YES;
    }

    public static void startOfTheGame() {
        String description = "Answer 'yes' if given is prime. Otherwise answer 'no'.";

        var task = new String[3][2];
        for (var round : task) {
            var currentNumber = Engine.randomInt();
            round[0] = Integer.toString(currentNumber);
            round[1] = isPrime(currentNumber);
        }

        Engine.run(description, task);
    }
}
