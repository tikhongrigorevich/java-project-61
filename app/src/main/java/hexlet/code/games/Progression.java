package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final Random RANDOM = new Random();
    private static final int MAX_START = 50;
    private static final int MAX_STEP = 11;
    private static final int PROGRESSION_LENGTH = 10;

    private static String[] getProgression(int start, int step) {
        String[] progression = new String[PROGRESSION_LENGTH];

        for (var i = 0; i < PROGRESSION_LENGTH; i += 1) {
            int currentElement = start + (i * step);
            progression[i] = Integer.toString(currentElement);
        }

        return progression;
    }

    public static void run() {
        String description = "What number is missing in the progression?";
        var task = new String[3][2];

        for (var round : task) {
            int start = RANDOM.nextInt(MAX_START);
            int step = RANDOM.nextInt(MAX_STEP);
            int index = RANDOM.nextInt(PROGRESSION_LENGTH);

            String[] progression = getProgression(start, step);
            String answer = progression[index];
            progression[index] = "..";

            round[0] = String.join(" ", progression);
            round[1] = answer;
        }

        Engine.run(description, task);
    }
}
