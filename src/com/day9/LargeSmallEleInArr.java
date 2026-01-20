package com.day9;

public class LargeSmallEleInArr {
	/**
     * Find largest and smallest elements in array
     */
    public static void findLargestSmallest(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        
        int largest = arr[0];
        int smallest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Traversal
        int[] testArr = {5, 2, 8, 1, 9};
		// Largest and Smallest
        System.out.println("=== Largest and Smallest ===");
        findLargestSmallest(testArr);
        System.out.println();

	}

}
