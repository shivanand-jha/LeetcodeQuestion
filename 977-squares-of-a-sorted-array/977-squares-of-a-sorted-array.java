class Solution {
    public int[] sortedSquares(int[] nu) {
        int l = 0;
        int n = nu.length-1;
        int[] a = new int[n+1];
        for(int i=n; i>=0; i--)
        {
            if(Math.abs(nu[l]) > Math.abs(nu[n]))
            {
                a[i] = nu[l]*nu[l];
                l++;
            }
            else{
                a[i] = nu[n]*nu[n];
                n--;
            }
        }
        return a;
    }
}