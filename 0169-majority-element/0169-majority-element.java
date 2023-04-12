class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0)return 0;
        int temp = nums[0];
        int c = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(c==0) temp = nums[i];
            c += temp == nums[i] ? 1 : -1;
        }
        return temp;
    }
}