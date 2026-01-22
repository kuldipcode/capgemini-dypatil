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
public class ReversePolish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
