package com.day12;

public class Assignment {
	
	/*
	 * Assignments for Stacks (LIFO - Last In, First Out)
1. The Word Reverser

Task: Ask the user for a string (e.g., "Java"). Push each character onto a Stack<Character>.

Goal: Pop the characters off one by one to print the string in reverse ("avaJ").

2. Bracket Balancer (The Basics)

Task: Create a program that checks if a string of parentheses () is balanced.

Goal: Push ( onto the stack. When you hit a ), pop from the stack. If the stack is empty when you try to pop, or not empty at the end, it’s unbalanced.

3. The "Undo" Simulator

Task: Create a list of 5 strings representing "Actions" (e.g., "Type A", "Type B").

Goal: Allow the user to type "undo" to pop the last action off the stack and display the current state of the "document."

4. Minimum Element Finder

Task: Create a stack of Integers.

Goal: Write a method that finds the smallest number in the stack without destroying the stack (hint: you'll need a temporary stack to hold values as you search).

5. Decimal to Binary Converter

Task: Take an integer input. Repeatedly divide by 2 and push the remainder (0 or 1) onto a stack.

Goal: Pop all elements to display the binary equivalent.

Assignments for Queues (FIFO - First In, First Out)
6. The Printer Queue

Task: Create a Queue<String> representing print jobs. Add "Document1", "Document2", and "Document3".

Goal: Use a loop to "process" the jobs (poll them) and print "Printing: [Document Name]..." in the order they were added.

7. Circular Movie Ticket Line

Task: Add 5 names to a Queue.

Goal: Simulate a "fairness" algorithm: Remove the first person, print their name, but then immediately add them back to the end of the line. Do this 10 times to show the rotation.

8. Interleaving Two Queues

Task: Create two queues: Q1: [1, 3, 5] and Q2: [2, 4, 6].

Goal: Create a third queue that merges them in alternating order: [1, 2, 3, 4, 5, 6].

9. Palindrome Checker (Stack + Queue)

Task: Take a word as input. Put every letter into a Stack AND a Queue.

Goal: Compare the pop() (Stack) and the poll() (Queue). If they match for every character, the word is a palindrome.

10. Simple Supermarket Checkout

Task: Create a Queue of "Customers" (each customer is an object with a name and a number of items).

Goal: Calculate the total time to clear the line if each item takes 5 seconds to scan.
	 */
}
