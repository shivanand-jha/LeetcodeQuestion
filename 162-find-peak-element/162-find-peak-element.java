class Solution {
    public int findPeakElement(int[] a) {
        int max = Integer.MIN_VALUE;
        for(int i=1; i<a.length; i++)
        {
            if(a[i]>a[i-1])
            {
               max = i;
            }
        }
        return max>Integer.MIN_VALUE?max:0;
    }
}