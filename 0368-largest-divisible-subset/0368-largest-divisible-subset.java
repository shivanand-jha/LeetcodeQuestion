class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> a = new ArrayList<Integer>();
        if(nums==null || nums.length==0)
        {
            return a;
        }
        Arrays.sort(nums);
        List<List<Integer>> dp = new ArrayList<>();
        for(int n:nums) {dp.add(new ArrayList<Integer>());}
        for(int i=0; i<nums.length; i++)
        {
            List<Integer> max = new ArrayList<>();
            for(int j=0; j<i; j++)
            {
                if(nums[i]%nums[j]==0 && max.size()<dp.get(j).size())
                {
                    max = dp.get(j);
                }
            }
            dp.get(i).addAll(max);
            dp.get(i).add(nums[i]);
        }
        for(int i=0; i<dp.size(); i++)
        {
            if(a.size()<dp.get(i).size())
            {
                a = dp.get(i);
            }
        }
        return a;
    }
}