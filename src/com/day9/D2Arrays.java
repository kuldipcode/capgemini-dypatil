package com.day9;

import java.util.Arrays;

public class D2Arrays {
// ==================== 1D AND 2D ARRAYS ====================
     /**
     * Demo: Creating and initializing 1D arrays
     */
    public static void demo1DArrays() {
        System.out.println("=== 1D Arrays Demo ===");
        
        // Declaration and initialization
        // int[] arr = new int[5];  // Array of size 5 with default values (0)
        int[] arr2 = {10, 20, 30, 40, 50};  // Array literal
        
        // Accessing elements
        System.out.println("First element: " + arr2[0]);
        System.out.println("Array length: " + arr2.length);
        
        // Modifying elements
        arr2[2] = 100;
        System.out.println("Modified array: " + Arrays.toString(arr2));
        System.out.println();
    }
    
    /**
     * Demo: Creating and initializing 2D arrays
     */
    public static void demo2DArrays() {
        System.out.println("=== 2D Arrays Demo ===");
        
        // Declaration and initialization
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Accessing elements
        System.out.println("Element at [1][2]: " + matrix[1][1]);
        
        // Print entire 2D array
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
        // 1D and 2D Arrays Demo
        demo1DArrays();
        demo2DArrays();      
        

}
}
