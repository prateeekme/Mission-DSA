package Codopedia.Graphs;

import java.util.ArrayList;
import java.util.List;

public class maxAreaOfIsland {

    int m = 0;
    int n = 0;
    //int countTemp = 0;
    public int maxAreaOfIsland(int[][] grid) {

        if (grid == null){
            return 0;
        }

        m = grid.length; // Calculating rows
        n = grid[0].length; // Calculating columns
        int res = 0;

        for (int i = 0; i < m; i++){
            for (int j = 0;j < n; j++){

                if (grid[i][j] == 1){

                    int countTemp = dfsMeth(grid, i, j);
                    res = Math.max(res, countTemp);

         //         System.out.println(countTemp);
                }

            }
        }
        return res;

    }

    private int dfsMeth(int[][] grid, int a, int b) {

        if (a < 0 || b < 0 || a >= m || b >= n || grid[a][b] != 1){
            return 0;
        }

        grid[a][b] = -1; // Marking as visited
        int countTemp = 1;

        countTemp += dfsMeth(grid, a+1, b);
        countTemp += dfsMeth(grid, a-1, b);
        countTemp += dfsMeth(grid, a, b+1);
        countTemp += dfsMeth(grid, a, b-1);
        //temp.add(++countTemp);

        return countTemp;
    }


    public static void main(String[] args) {

        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };

        maxAreaOfIsland maxAreaOfIsland = new maxAreaOfIsland();
        int result = maxAreaOfIsland.maxAreaOfIsland(grid);
        System.out.println(result);

    }

}
