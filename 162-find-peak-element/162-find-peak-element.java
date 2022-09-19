class Solution {
    public int findPeakElement(int[] a) {
        
        int start =0;
        int end  =a.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(a[mid]>a[mid+1])
            {
               end = mid;
            }
            else  {
                start = mid+1;
            }
        }
        return end;
    }
}