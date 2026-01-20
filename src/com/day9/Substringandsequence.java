package com.day9;

public class Substringandsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Substrings and Subsequences
        printAllSubstrings("abc");
        System.out.println("Is 'ace' subsequence of 'abcde'? " + isSubsequence("ace", "abcde"));
        System.out.println("Longest common substring of 'abcdef' and 'xbcdf': " + 
                          longestCommonSubstring("abcdef", "xbcdf"));
        System.out.println();

	}

// ==================== SUBSTRING AND SUBSEQUENCES ====================
    
    /**
     * Find all substrings of a string
     */
    public static void printAllSubstrings(String str) {
        System.out.println("All substrings of '" + str + "':");
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
        System.out.println("\n");
    }
    
    /**
     * Check if one string is subsequence of another
     */
    public static boolean isSubsequence(String sub, String main) {
        int subIndex = 0;
        
        for (int i = 0; i < main.length() && subIndex < sub.length(); i++) {
            if (main.charAt(i) == sub.charAt(subIndex)) {
                subIndex++;
            }
        }
        
        return subIndex == sub.length();
    }
    
    /**
     * Find longest common substring
     */
    public static String longestCommonSubstring(String s1, String s2) {
        int maxLen = 0;
        int endIndex = 0;
        
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        
        return s1.substring(endIndex - maxLen, endIndex);
    }
}
