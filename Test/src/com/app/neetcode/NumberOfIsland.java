package com.app.neetcode;

public class NumberOfIsland {
    public static void main(String[] args) {
        char [][]   grid = {
                {'0','1','1','1','0'},
                {'0','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
            };

        char [][]   grids = {
                {'1','1','0','0','1'},
                {'1','1','0','0','1'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println(numIslands(grids));
    }
    public static int numIslands(char[][] grid) {
        if (grid == null && grid.length == 0) {
            return 0;
        }
        int numberOfIsland = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numberOfIsland++;
                    dfs(grid, i, j);
                }
            }
        }
        return numberOfIsland;
    }

    public static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }


}
