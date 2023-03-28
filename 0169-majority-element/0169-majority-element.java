class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0)return 0;
        int temp = nums[0];
        int c = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(temp == nums[i])
            {
                c++;
                continue;
            }
            if(c>1){
                c--;
                continue;
            }
            temp  = nums[i];
        }
        return temp;
    }
}