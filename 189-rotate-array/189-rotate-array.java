class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums , int a , int b)
    {
        int a1=a;
        int b1=b;
        while(a1<b1)
        {
            int temp =nums[b1];
            nums[b1]=nums[a1];
            nums[a1]=temp;
            a1++;
            b1--;
        }
    }
}