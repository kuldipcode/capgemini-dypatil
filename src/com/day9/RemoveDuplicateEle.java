package com.day9;

import java.util.Arrays;

public class RemoveDuplicateEle {
// ==================== REMOVE DUPLICATES ====================
    
    /**
     * Remove duplicates from sorted array (in-place)
     * Returns new length of array
     */
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        
        int uniqueIndex = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        
        return uniqueIndex + 1;
    }
    public static void main(String[] args) {
    // Remove Duplicates
    System.out.println("=== Remove Duplicates ===");
    int[] dupArr = {1, 1, 2, 2, 2, 3, 4, 4, 5};
    System.out.println("Original: " + Arrays.toString(dupArr));
    int newLength = removeDuplicates(dupArr);
    System.out.print("After removing duplicates: ");
    for (int i = 0; i < newLength; i++) {
        System.out.print(dupArr[i] + " ");
    }
    System.out.println("\n");
    }

}
