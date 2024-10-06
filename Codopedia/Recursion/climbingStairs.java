package Codopedia.Recursion;

/*
You are given an integer n representing the number of steps to reach the top of a staircase. You can climb either 1 or 2 steps at a time.
Return the number of distinct ways to climb to the top of the staircase.

Example 1:
Input:
n = 2
Output:
2

Explanation:
1 step + 1 step = 2
2 steps = 2

Example 2:
Input:
n = 3
Output:
3

Constraints:
1 <= n <= 30
 */

public class climbingStairs {
    public int climbStairs(int n) {

        if (n == 1 || n == 2){
            return n;
        }

        return (climbStairs(n-1) + climbStairs(n-2));
    }

    public static void main(String[] args) {

        climbingStairs climbingStairs = new climbingStairs();
        int result = climbingStairs.climbStairs(8);
        System.out.println(result);


    }
}
