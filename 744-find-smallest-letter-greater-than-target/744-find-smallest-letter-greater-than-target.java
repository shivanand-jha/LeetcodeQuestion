class Solution {
    public char nextGreatestLetter(char[] a, char target) {
        int start =0;
        int end  =a.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if (a[mid]>target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return a[start % a.length];
    }
}