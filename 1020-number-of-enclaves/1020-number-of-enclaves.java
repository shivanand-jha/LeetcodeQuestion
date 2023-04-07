class Solution {
    public int numEnclaves(int[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(i == 0 || j == 0 || i == grid.length - 1 || j == grid[i].length - 1)
                    dfs(grid, i, j);
            }
        }
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1)
                    result++;
            }
        }
        
        return result;
    }
    
    public void dfs(int a[][], int i, int j) {
        if(i >= 0 && i <= a.length - 1 && j >= 0 && j <= a[i].length - 1 && a[i][j] == 1) {
            a[i][j] = 0;
            dfs(a, i + 1, j);
            dfs(a, i - 1, j);
            dfs(a, i, j + 1);
            dfs(a, i, j - 1);
        }
    }
}