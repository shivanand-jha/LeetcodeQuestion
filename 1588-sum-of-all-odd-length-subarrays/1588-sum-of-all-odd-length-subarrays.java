class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
     int sum=0;
        int n=arr.length;
        for(int i=0; i<arr.length; ++i)
        {
            sum  += ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }
        return sum;
    }
}