public class NumberOfIsland {
    // Leet 17
    public int numIsland(char[][] grid){
        int numIsland = 0;

        if (grid == null || grid.length == 0)
            return 0;

        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[i].length; i1++) {
                if (grid[i][i1] == '1'){
                    numIsland += dfs(grid, i, i1);
                }
            }
        }
        return numIsland;
    }
    public int dfs(char[][] grid, int i, int j){
        if ( i < 0 || i >= grid.length || j < 0 || j <= grid[i].length || grid[i][j] == '0')
            return 0;
        grid[i][j] = '0';
        dfs(grid, i+1, j);  // up
        dfs(grid, i-1, j);  // down
        dfs(grid, i, j-1);  // left
        dfs(grid, i, j+1);  // right
        return 1;
    }
}
