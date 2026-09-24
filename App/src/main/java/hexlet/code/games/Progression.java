package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static int progressionRandomInt() {
        return (int) (Math.random() * 11);
    }

    private static String missingNumber;

    private static String getProgression() {
        int start = Engine.randomInt();
        int step = progressionRandomInt();
        int missingElement = progressionRandomInt();

        StringBuilder progression = new StringBuilder();
        String separator = "";

        for (var i = 0; i < 10; i += 1) {
            int currentElement = start + (i * step);
            if (i == missingElement) {
                progression.append(separator).append("..");
                missingNumber = Integer.toString(currentElement);
            } else {
                progression.append(separator).append(currentElement);
            }
            separator = ", ";
        }

        return progression.toString();
    }

    public static void startOfTheGame() {
        String description = "What number is missing in the progression?";

        var task = new String[3][2];
        for (var round : task) {
            round[0] = getProgression();
            round[1] = missingNumber;
        }

        Engine.run(description, task);
    }
}
