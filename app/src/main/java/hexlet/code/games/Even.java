package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static int randomInt() {
        return (int) (Math.random() * 100);
    }

    public static void run() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        var task = new String[3][2];
        for (var round : task) {

            round[0] = Integer.toString(randomInt());
            int question = Integer.parseInt(round[0]);
            round[1] = (question % 2 == 0 ? "yes" : "no");
        }

        Engine.run(description, task);
    }
}
