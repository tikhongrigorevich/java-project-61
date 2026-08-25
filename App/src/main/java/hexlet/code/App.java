package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import static hexlet.code.Engine.SCANNER;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit");
        System.out.print("Your choice: ");
        int choiceOfUser = SCANNER.nextInt();
        SCANNER.nextLine();

        switch (choiceOfUser) {
            case 1 -> Cli.getTalkingToUser();
            case 2 -> Even.startOfTheGame();
            case 3 -> Calculator.startOfTheGame();
            case 4 -> GCD.startOfTheGame();
            case 0 -> SCANNER.close();
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }
}
