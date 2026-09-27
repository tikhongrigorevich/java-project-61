package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static int randomInt() {
        return (int) (Math.random() * 100);
    }

    private static int getGcd(int a, int b) {
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

            int number1 = randomInt();
            int number2 = randomInt();

            round[0] = number1 + " " + number2;
            round[1] = Integer.toString(getGcd(number1, number2));
        }

        Engine.run(description, task);
    }
}
