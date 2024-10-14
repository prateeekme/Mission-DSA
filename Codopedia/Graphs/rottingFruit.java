package Codopedia.Graphs;

/*
You are given a 2-D matrix grid. Each cell can have one of three possible values:

0 representing an empty cell
1 representing a fresh fruit
2 representing a rotten fruit
Every minute, if a fresh fruit is horizontally or vertically adjacent to a rotten fruit, then the fresh fruit also becomes rotten.

Return the minimum number of minutes that must elapse until there are zero fresh fruits remaining. If this state is impossible within the grid, return -1.

Example 1:
Input: grid = [[1,1,0],[0,1,1],[0,1,2]]
Output: 4

Example 2:
Input: grid = [[1,0,1],[0,2,0],[1,0,1]]
Output: -1

Constraints:
1 <= grid.length, grid[i].length <= 10
 */

import Codopedia.Sorting.insertionSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rottingFruit {

    static class Position{
        int x;
        int y;
        Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int orangesRotting(int[][] grid) {

        Queue<Position> queue = new LinkedList<>();
        int total = 0;
        int rotten = 0;
        int time = 0;

        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){

                if (grid[i][j] == 1 || grid[i][j] == 2){
                    total++; //calculate both fresh and rotten
                }
                if (grid[i][j] == 2){
                    queue.offer(new Position(i, j));
                }

            }
        }

        // If no oranges
        if (total == 0){
            return 0;
        }

        while (!queue.isEmpty() || rotten < total){

            int size = queue.size();
            rotten += size;

            //count the num of rotten oranges, if it equals to total num, return time;
            if (rotten == total){
                return time;
            }

            //every min time ++
            time++; //Increase after each time of BFS

            for (int i = 0; i< size; i++){
                Position p = queue.poll(); //Dequeue the curr orange

                // check the cell in the left/right/top/down of the rotten orange, if it is a fresh orange, enqueue it.

                //Bottom
                if (p.x + 1 < row && grid[p.x+1][p.y] == 1){
                    grid[p.x + 1][p.y] = 2;
                    queue.offer(new Position(p.x+1, p.y));
                }

                //Top
                if (p.x - 1 >= 0 && grid[p.x-1][p.y] == 1){
                    grid[p.x - 1][p.y] = 2;
                    queue.offer(new Position(p.x-1, p.y));
                }

                //Right
                if (p.y + 1 < col && grid[p.x][p.y+1] == 1){
                    grid[p.x][p.y+1] = 2;
                    queue.offer(new Position(p.x, p.y+1));
                }

                if (p.y-1 >= 0 && grid[p.x][p.y-1] == 1){
                    grid[p.x][p.y-1] = 2;
                    queue.offer(new Position(p.x, p.y-1));
                }
                //queue.poll();
            }

            //return -1;//
        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1, 1, 0},
                {0, 1, 1},
                {0, 1, 2}
        };
        rottingFruit rottingFruit = new rottingFruit();
        int result = rottingFruit.orangesRotting(grid);
        System.out.println(result);
    }



}
