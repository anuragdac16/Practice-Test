import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExpressionEvaluator {

    public static void main(String[] args) {
        String expression = "5+2-3*5/3";
        try {
            double result = evaluate(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error evaluating expression: " + e.getMessage());
        }
    }

    public static double evaluate(String expression) {
        List<String> tokens = tokenize(expression);
        List<String> postfix = infixToPostfix(tokens);
        return evaluatePostfix(postfix);
    }

    private static List<String> tokenize(String expression) {
        List<String> tokens = new ArrayList<>();
        StringBuilder number = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (!number.isEmpty()) {
                    tokens.add(number.toString());
                    number.setLength(0);
                }
                tokens.add(Character.toString(c));
            }
        }

        if (!number.isEmpty()) {
            tokens.add(number.toString());
        }

        return tokens;
    }

    private static List<String> infixToPostfix(List<String> infix) {
        List<String> postfix = new ArrayList<>();
        Stack<String> operators = new Stack<>();
        for (String token : infix) {
            if (token.matches("\\d+")) {
                postfix.add(token);
            } else if (token.equals("(")) {
                operators.push(token);
            } else if (token.equals(")")) {
                while (!operators.isEmpty() && !operators.peek().equals("(")) {
                    postfix.add(operators.pop());
                }
                operators.pop();
            } else {
                while (!operators.isEmpty() && precedence(token) <= precedence(operators.peek())) {
                    postfix.add(operators.pop());
                }
                operators.push(token);
            }
        }

        while (!operators.isEmpty()) {
            postfix.add(operators.pop());
        }

        return postfix;
    }

    private static int precedence(String operator) {
        return switch (operator) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            default -> -1;
        };
    }

    private static double evaluatePostfix(List<String> postfix) {
        Stack<Double> stack = new Stack<>();

        for (String token : postfix) {
            if (token.matches("\\d+")) {
                stack.push(Double.parseDouble(token));
            } else {
                double right = stack.pop();
                double left = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(left + right);
                        break;
                    case "-":
                        stack.push(left - right);
                        break;
                    case "*":
                        stack.push(left * right);
                        break;
                    case "/":
                        stack.push(left / right);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
