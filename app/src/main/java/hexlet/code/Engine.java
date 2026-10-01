package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void run(String description, String[][] game) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        boolean isGameWon = true;

        for (var round : game) {

            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.nextLine();

            if (!userAnswer.equals(round[1])) {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was "
                        + round[1] + ".");
                System.out.println("Let's try again, " + userName + "!");
                isGameWon = false;
                break;
            } else {
                System.out.println("Correct!");
            }
        }

        if (isGameWon) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Goodbye!");
        }

        SCANNER.close();
    }
}
