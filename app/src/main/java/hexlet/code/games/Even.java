package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final Random RANDOM = new Random();

    public static void run() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        var task = new String[Engine.ROUNDS_COUNT][2];
        for (var round : task) {

            round[0] = Integer.toString(RANDOM.nextInt(100));
            int question = Integer.parseInt(round[0]);
            round[1] = (question % 2 == 0 ? "yes" : "no");
        }

        Engine.run(description, task);
    }
}
