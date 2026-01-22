package com.day12;
/* solve Reverse Polish Notation (RPN) using a Stack in Java, 
 * we follow a simple rule: Operands (numbers) go onto the stack, and operators pull them off.
 * In RPN, the operator follows its operands (e.g., 3 4 + instead of 3 + 4). 
 * This removes the need for parentheses and follows a strict "Last-In, First-Out" logic, 
 * which is why a Stack is the perfect data structure for the job.The AlgorithmIterate through each token in the expression.
 * If the token is a number, push it onto the stack.If the token is an operator ($+, -, *, /$):Pop the top two elements from the stack.Apply the operator (Note: the first pop is the right operand, the second is the left).
 * Push the result back onto the stack.After the loop, the final result is the only element remaining in the stack.
 * 
 * */
import java.util.Stack;

public class ReversePolish {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                // Pop the two operands
                int b = stack.pop();
                int a = stack.pop();
                
                // Calculate and push result back
                stack.push(applyOperator(a, b, token));
            } else {
                // Token is a number, push to stack
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private static int applyOperator(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; // Integer division
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        String[] expression = {"4", "13", "5", "/", "+"}; 
        // Logic: 4 + (13 / 5) = 4 + 2 = 6
        System.out.println("Result: " + evalRPN(expression));
    }
}
