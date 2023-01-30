class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length+1;
        int[] eCount = new int[n+1];
        for(int[] e:edges)
        {
            int x = e[0];
            int y = e[1];
            eCount[x]++;
            eCount[y]++;
            if(eCount[x]>1)
            {
                return x;
            }
            if(eCount[y]>1)
            {
                return y;
            }
        }
        return 0;
    }
}