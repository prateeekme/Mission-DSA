package Codopedia.DynamicProgramming;

/*
You are given an integer n representing the number of steps to reach the top of a staircase. You can climb with either 1 or 2 steps at a time.
Return the number of distinct ways to climb to the top of the staircase.

Example 1:
Input: n = 2
Output: 2
Explanation:
1 + 1 = 2
2 = 2

Example 2:
Input: n = 3
Output: 3
Explanation:
1 + 1 + 1 = 3
1 + 2 = 3
2 + 1 = 3

Constraints:
1 <= n <= 30
 */

public class climbingStairs {

    public int climbStair(int n) {

        if(n == 1 || n == 2 || n == 3){
            return n;
        }

        int result = climbStair(n-1) + climbStair(n-2);
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        climbingStairs climbingStairs = new climbingStairs();
        int result = climbingStairs.climbStair(n);
        System.out.println(result);
    }
}
