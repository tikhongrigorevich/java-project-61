package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void startOfTheGame() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        var task = new String[3][2];
        for (var round : task) {

            round[0] = Integer.toString(Engine.randomInt());
            int question = Integer.parseInt(round[0]);

            if (question % 2 == 0) {
                round[1] = "yes";
            } else {
                round[1] = "no";
            }
        }

        Engine.run(description, task);
    }
}
