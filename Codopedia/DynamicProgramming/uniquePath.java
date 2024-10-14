package Codopedia.DynamicProgramming;

/*
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
The test cases are generated so that the answer will be less than or equal to 2 * 109.

Example 1:
Input: m = 3, n = 7
Output: 28

Example 2:
Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:

1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down

Constraints:
1 <= m, n <= 100
 */

public class uniquePath {

    public int uniquePaths(int m, int n) {
        int[] prevRow = new int[n];

        for (int i = m - 1; i >= 0; i--) {
            int[] curRow = new int[n];
            curRow[n - 1] = 1;
            for (int j = n - 2; j >= 0; j--) {
                curRow[j] = curRow[j + 1] + prevRow[j];
            }
            prevRow = curRow;
        }
        return prevRow[0];
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 7;
        uniquePath uniquePath = new uniquePath();
        int result = uniquePath.uniquePaths(m,n);
        System.out.println(result);
    }

}
