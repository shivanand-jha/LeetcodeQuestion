class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cSum=0;
        int c=0;
        for(int i=0; i<n; i++)
        {
            cSum=0;
            for(int j=i; j<n; j++)
            {
                cSum +=nums[j];
                if(cSum==k)
                {
                    c++;
                }
            }
        }
        return c;
    }
}