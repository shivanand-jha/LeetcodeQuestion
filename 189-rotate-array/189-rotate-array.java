class Solution {
    public void rotate(int[] nums, int k) {
        k %=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static  void reverse(int[] a, int l, int h)
    {
        while(l<h)
        {
            int temp = a[h];
            a[h] = a[l];
            a[l]=temp;
            l++;
            h--;
        }
    }
}