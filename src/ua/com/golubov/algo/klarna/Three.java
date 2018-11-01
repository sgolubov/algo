package ua.com.golubov.algo.klarna;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.BiFunction;

public class Three {

    private static final Map<String, BiFunction<Double, Double, Double>> OPERATORS =
            new HashMap<String, BiFunction<Double, Double, Double>>() {{
                put("+", (a, b) -> a + b);
                put("-", (a, b) -> a - b);
                put("/", (a, b) -> a / b);
                put("*", (a, b) -> a * b);
            }};

    public static double evaluate(String expr) {
        if (expr == null) {
            throw new IllegalArgumentException("Expression can't be null!");
        }

        if (expr.equals("")) {
            return 0d;
        }

        String[] tokens = expr.split(" ");

        LinkedList<String> stack = new LinkedList<>();

        for (String token : tokens) {
            BiFunction<Double, Double, Double> operator = OPERATORS.get(token);
            if (operator != null) {
                Double operand2 = Double.valueOf(stack.pop());
                Double operand1 = Double.valueOf(stack.pop());
                Double res = operator.apply(operand1, operand2);
                stack.push(String.valueOf(res));
                continue;
            }
            stack.push(token);
        }

        return Double.valueOf(stack.pop());
    }
}
