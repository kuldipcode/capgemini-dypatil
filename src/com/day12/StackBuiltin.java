package com.day12;

import java.util.Stack;

public class StackBuiltin {
    public static void main(String[] args) {
        // Create a stack of Strings
        Stack<String> books = new Stack<>();

        // 1. push() method: Add items to the top of the stack
        books.push("Java");
        books.push("Python");
        books.push("C++");
        System.out.println("Stack after push operations: " + books);

        // 2. peek() method: View the top item without removing it
        String topItem = books.peek();
        System.out.println("Top item (peek): " + topItem);
        System.out.println("Stack after peek: " + books); // Stack remains unchanged

        // 3. pop() method: Remove and return the top item
        String removedItem = books.pop();
        System.out.println("Removed item (pop): " + removedItem);
        System.out.println("Stack after pop: " + books); // "C++" is removed

        // 4. search() method: Find the 1-based position from the top
        int position = books.search("Java");
        System.out.println("Position of 'Java' from the top: " + position); // "Java" is at position 2

        // 5. empty() method: Check if the stack is empty
        boolean isEmpty = books.empty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
