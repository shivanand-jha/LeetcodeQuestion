class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] num = new int[n];
        for(int i=0,tmp=1; i<n; i++)
        {
            num[i] = tmp;
            tmp *= nums[i];
        }
        for(int i=n-1 , tmp=1; i>=0; i--)
        {
            num[i] *= tmp;
            tmp *=nums[i];
        }
        return num;
    }
}