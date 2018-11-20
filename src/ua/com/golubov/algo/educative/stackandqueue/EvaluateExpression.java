package ua.com.golubov.algo.educative.stackandqueue;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.BiFunction;

public class EvaluateExpression {

    private static final String ADDITION = "+";
    private static final String SUBTRACTION = "-";
    private static final String DIVISION = "/";
    private static final String MULTIPLICATION = "*";

    private static final Map<String, BiFunction<Double, Double, Double>> OPERATORS =
            new HashMap<String, BiFunction<Double, Double, Double>>() {{
                put(ADDITION, (a, b) -> a + b);
                put(SUBTRACTION, (a, b) -> a - b);
                put(DIVISION, (a, b) -> a / b);
                put(MULTIPLICATION, (a, b) -> a * b);
            }};

    public static double evaluate(String expression) {
        String postfix = convertToPostFix(expression.split(" "));

        Deque<Double> operands = new LinkedList<>();

        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            BiFunction<Double, Double, Double> operator = OPERATORS.get(token);
            if (operator != null) {
                Double operand2 = operands.pop();
                Double operand1 = operands.pop();
                operands.push(operator.apply(operand1, operand2));
            } else {
                operands.push(Double.valueOf(token));
            }
        }

        return operands.pop();
    }

    private static String convertToPostFix(String[] tokens) {
        StringBuilder result = new StringBuilder();

        Deque<String> operators = new LinkedList<>();

        for (String token : tokens) {
            if (OPERATORS.get(token) != null) {
                while (!operators.isEmpty() && operatorPrecedence(token) <= operatorPrecedence(operators.peek()))
                    result.append(operators.pop())
                            .append(" ");
                operators.push(token);
            } else {
                result.append(token)
                        .append(" ");
            }
        }

        while (!operators.isEmpty())
            result.append(operators.pop())
                    .append(" ");

        return result.toString();
    }

    private static int operatorPrecedence(String operator) {
        switch (operator) {
            case MULTIPLICATION:
            case DIVISION:
                return 2;
            case ADDITION:
            case SUBTRACTION:
                return 1;
            default:
                throw new IllegalStateException();
        }
    }

}
