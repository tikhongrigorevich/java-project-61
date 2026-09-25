package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static String getRandomOperator() {
        int index = (int) (Math.random() * OPERATORS.length);
        return OPERATORS[index];
    }

    public static void startOfTheGame() {
        String description = "What is the result of the expression?";

        var task = new String[3][2];
        for (var round : task) {

            var operand1 = Engine.randomInt();
            var operand2 = Engine.randomInt();
            var operator = getRandomOperator();

            round[0] = operand1 + " " + operator + " " + operand2;

            int result = switch (operator) {
                case "+" -> operand1 + operand2;
                case "-" -> operand1 - operand2;
                case "*" -> operand1 * operand2;
                default -> throw new IllegalStateException("Unexpected value: " + operator);
            };

            round[1] = Integer.toString(result);
        }

        Engine.run(description, task);
    }
}
