package Codopedia.DynamicProgramming;

import java.util.Arrays;

public class uniquePathII {

    public static void main(String[] args) {
        uniquePathII solution = new uniquePathII();

        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int result = solution.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(result);
    }

    private int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int dp[][] = new int[row][col];

        for(int[] num: dp){
            Arrays.fill(num, -1);
        }

        return helperMethod(row - 1, col - 1, obstacleGrid, dp);
    }

    public int helperMethod(int row, int col, int[][] obstacleGrid, int dp[][]){

        if (row < 0 || col < 0){
            return 0;
        }

        if (obstacleGrid[row][col] == 1){
            return 0;
        }

        if (row == 0 && col == 0){
            return 1;
        }

        if(dp[row][col] != -1){
            return dp[row][col];
        }

        int x = helperMethod(row - 1, col, obstacleGrid, dp);
        int y = helperMethod(row, col - 1, obstacleGrid, dp);

        dp[row][col] = x + y;
        return x+y;

    }

}
