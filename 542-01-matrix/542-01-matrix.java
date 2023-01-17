class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int n=mat.length,m=mat[0].length;
        int[][] ans=new int[n][m];
        boolean[][] visited=new boolean[n][m];

        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new int[]{i,j,0});
                }
            }
        }

        while(!q.isEmpty())
        {
            int[] value=q.poll();
            int i=value[0],j=value[1],dis=value[2];

            if(visited[i][j]) continue;
            visited[i][j]=true;

                ans[i][j]=dis;

            if(i+1<n) q.add(new int[]{i+1,j,dis+1});
            if(i-1>=0) q.add(new int[]{i-1,j,dis+1});
            if(j+1<m) q.add(new int[]{i,j+1,dis+1});
            if(j-1>=0) q.add(new int[]{i,j-1,dis+1});
        }

            return ans;
    }
}