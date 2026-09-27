package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static int randomInt() {
        return (int) (Math.random() * 50);
    }
    private static int progressionRandomInt() {
        return (int) (Math.random() * 11);
    }

    private static String[] getProgression() {
        int start = randomInt();
        int step = progressionRandomInt();
        int missingElement = (int) (Math.random() * 10);

        StringBuilder progression = new StringBuilder();
        String separator = "";
        String answer = "";

        for (var i = 0; i < 10; i += 1) {
            int currentElement = start + (i * step);
            if (i == missingElement) {
                progression.append(separator).append("..");
                answer = Integer.toString(currentElement);
            } else {
                progression.append(separator).append(currentElement);
            }
            separator = ", ";
        }

        return new String[] {progression.toString(), answer};
    }

    public static void run() {
        String description = "What number is missing in the progression?";
        var task = new String[3][2];

        for (var round : task) {
            String[] progression = getProgression();
            round[0] = progression[0];
            round[1] = progression[1];
        }

        Engine.run(description, task);
    }
}
