package com.day9;

import java.util.Arrays;

public class Stringmanipulations {
	 /**
     * Various string manipulation operations
     */
	
	public static void stringManipulation() {
        System.out.println("=== String Manipulation ===");
        
        String str = "Hello World";
        
        // Length
        System.out.println("Length: " + str.length());
        
        // Character at index
        System.out.println("Char at index 6: " + str.charAt(6));
        
        // Substring
        System.out.println("Substring (0,5): " + str.substring(0, 5));
        
        // Case conversion
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Replace
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        
        // Split
        String[] words = str.split(" ");
        System.out.println("Split result: " + Arrays.toString(words));
        
        // Trim
        String padded = "  Hello  ";
        System.out.println("Trimmed: '" + padded.trim() + "'");
        
        // Contains
        System.out.println("Contains 'World': " + str.contains("World"));
        
        // Index of
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        
        System.out.println();
    }
    
}
