package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calculator {
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static final Random RANDOM = new Random();

    private static String getRandomOperator() {
        int index = (int) (Math.random() * OPERATORS.length);
        return OPERATORS[index];
    }

    private static int getResultOfExpression(String operator, int operand1, int operand2) {
        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    public static void run() {
        String description = "What is the result of the expression?";

        var task = new String[3][2];
        for (var round : task) {

            var operand1 = RANDOM.nextInt(100);
            var operand2 = RANDOM.nextInt(100);
            var operator = getRandomOperator();

            round[0] = operand1 + " " + operator + " " + operand2;
            round[1] = Integer.toString(getResultOfExpression(operator, operand1, operand2));
        }

        Engine.run(description, task);
    }
}
