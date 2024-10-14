package Codopedia.Graphs;


public class countNumberOfIslands {

    int m = 0;
    int n = 0;

    public int numIslands(char[][] grid) {

        if (grid.length == 0) {
            return 0;
        }
        int temp = 0;
        int count = 0;
        n = grid.length;
        m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    ++temp;
                    dfsMethod(grid, i, j);
                    ++count;

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        countNumberOfIslands countNumberOfIslands = new countNumberOfIslands();
        int res = countNumberOfIslands.numIslands(grid);
        System.out.println(res);
    }

    private void dfsMethod(char[][] grid, int i, int j) {
        {
            if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') {
                return;
            }
            grid[i][j] = '0';
            dfsMethod(grid, i + 1, j); // down
            dfsMethod(grid, i - 1, j); // up
            dfsMethod(grid, i, j + 1); // right
            dfsMethod(grid, i, j - 1); // left
        }

    }
}
