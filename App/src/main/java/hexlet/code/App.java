package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choiceOfUser = scanner.next();
        
        if (choiceOfUser.equals("1")) {
            Cli.getTalkingToUser();
        } else if (choiceOfUser.equals("2")) {
            EvenOrOdd.startParityGame();
        } else if (choiceOfUser.equals("0")) {
            scanner.close();
        }
    }
}
