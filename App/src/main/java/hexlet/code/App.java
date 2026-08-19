package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        int choiceOfUser = scanner.nextInt();
        switch (choiceOfUser) {
            case 1 -> Cli.getTalkingToUser();
            case 2 -> Even.startOfTheGame();
            case 3 -> Calculator.startOfTheGame();
            case 0 -> scanner.close();
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }
}
