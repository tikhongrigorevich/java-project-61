package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

public class Progression {
    private static int startRandomInt() {
        return (int) (Math.random() * 50);
    }
    private static int stepRandomInt() {
        return (int) (Math.random() * 11);
    }
    private static final List<String> ANSWERS = new ArrayList<>();

    private static String[] getProgression() {
        int start = startRandomInt();
        int step = stepRandomInt();
        int missingElement = (int) (Math.random() * 10);

        String[] progression = new String[10];

        for (var i = 0; i < 10; i += 1) {
            int currentElement = start + (i * step);
            if (i == missingElement) {
                progression[i] = "..";
                ANSWERS.add(Integer.toString(currentElement));
            } else {
                progression[i] = Integer.toString(currentElement);
            }
        }

        return progression;
    }

    public static void run() {
        String description = "What number is missing in the progression?";
        var task = new String[3][2];
        int index = 0;

        for (var round : task) {
            String progression = String.join(" ", getProgression());
            round[0] = progression;
            round[1] = ANSWERS.get(index);
            index += 1;
        }

        Engine.run(description, task);
    }
}
