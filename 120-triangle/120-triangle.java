class Solution {
    int[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        int depth = triangle.size();
        dp=new int[depth][depth];
        for (int i = 0; i < depth; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        int ansRec = minimumTotalRecursion(triangle, depth, 0, 0);
        return ansRec;
    }
     private int minimumTotalRecursion(List<List<Integer>> triangle, int depth, int i, int j) {
        if (i == depth - 1) {
            return triangle.get(i).get(j);
        }
        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }
        int cur = triangle.get(i).get(j);
        int down = cur + minimumTotalRecursion(triangle, depth, i + 1, j);
        int downDg = cur + minimumTotalRecursion(triangle, depth, i + 1, j + 1);
        return dp[i][j] = Math.min(down, downDg);
    }
}
