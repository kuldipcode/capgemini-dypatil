package com.day12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TodoQueue {
    public static void main(String[] args) {
        Queue<String> todoQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- Welcome to your Java To-Do List ---");

        while (running) {
            System.out.println("\nOptions: 1. Add Task | 2. Complete Next Task | 3. View All | 4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the task description: ");
                    String task = scanner.nextLine();
                    todoQueue.add(task);
                    System.out.println("Task added!");
                    break;

                case "2":
                    if (todoQueue.isEmpty()) {
                        System.out.println("No tasks left to do!");
                    } else {
                        // poll() removes the head of the queue
                        String completedTask = todoQueue.poll();
                        System.out.println("Completed: " + completedTask);
                    }
                    break;

                case "3":
                    if (todoQueue.isEmpty()) {
                        System.out.println("Your list is empty.");
                    } else {
                        System.out.println("Current Tasks (In Order): " + todoQueue);
                    }
                    break;

                case "4":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
