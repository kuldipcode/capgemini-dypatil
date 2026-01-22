package com.dsaintroduction;

public class Main {
    public static void main(String[] args) {
    	
    	try {
            // Code that might throw an exception
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line is skipped if exception occurs
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Error: Division by 0 is not allowed. Message: " + e.getMessage());
        } finally {
            // Code that always runs
            System.out.println("This is the finally block, always executed.");
        }
        System.out.println("Program continues after exception handling.");
    }
   
    }


//Java
