package hexlet.code;

import java.util.Scanner;

public class EvenOrOdd {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int randomInt() {
        return (int)(Math.random() * 100);
    }

    public static boolean yesAndNo(String answer) {
        return switch (answer) {
            case "yes" -> true;
            case "no" -> false;
            default -> false;
        };
    }

    public static String reverseAnswer(String answer) {
        if (answer.equals("yes")) {
            return "no";
        }
        return "yes";
    }

    public static void startParityGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var isGameWon = true;

        for (var i = 1; i < 4; i += 1) {
            var currentRandomInt = randomInt();

            System.out.println("Question: " + currentRandomInt);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                isGameWon = false;
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'yes' or 'no'.");
                break;
            }

            if (isEven(currentRandomInt) == yesAndNo(userAnswer)) {
                System.out.println("Correct!");
            } else {
                isGameWon = false;
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + reverseAnswer(userAnswer) + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (isGameWon) {
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }
}
