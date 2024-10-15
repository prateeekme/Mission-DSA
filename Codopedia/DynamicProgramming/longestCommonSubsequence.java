package Codopedia.DynamicProgramming;

/*
Given two strings text1 and text2, return the length of the longest common subsequence between the two strings if one exists, otherwise return 0.
A subsequence is a sequence that can be derived from the given sequence by deleting some or no elements without changing the relative order of the remaining characters.
For example, "cat" is a subsequence of "crabt".
A common subsequence of two strings is a subsequence that exists in both strings.

Example 1:
Input: text1 = "cat", text2 = "crabt"
Output: 3
Explanation: The longest common subsequence is "cat" which has a length of 3.

Example 2:
Input: text1 = "abcd", text2 = "abcd"
Output: 4

Example 3:
Input: text1 = "abcd", text2 = "efgh"
Output: 0
 */

public class longestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for(int i = text1.length() - 1; i >= 0; i--){
            for(int j = text2.length() - 1; j >= 0; j--){
                if(text1.charAt(i) == text2.charAt(j)){
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }

        }

        return dp[0][0];

    }

    public static void main(String[] args) {

        String text1 = "cat";
        String text2 = "crabt";

        longestCommonSubsequence longestCommonSubsequence = new longestCommonSubsequence();
        String result = String.valueOf(longestCommonSubsequence.longestCommonSubsequence(text1,text2));
        System.out.println(result);

    }

}
