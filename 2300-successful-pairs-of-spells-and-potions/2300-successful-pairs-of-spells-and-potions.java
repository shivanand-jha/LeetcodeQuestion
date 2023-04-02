class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res=new int[spells.length];
        
        for(int i=0;i<spells.length;i++)
        {
            int count=binarySearch(spells[i],potions,success);
            res[i]=count;
        }
        
        return res;
    }
    
    public static int binarySearch(int spell, int[] potions, long success)
    {
        int i=0;
        int j=potions.length-1;
        int n=potions.length;
        
        int res=0;
        
        while(i<=j)
        {
            int mid=(i+j)/2;
            
            if((spell*1.0)*potions[mid]>=success)
            {
                res=n-mid;
                j=mid-1;
            }
            else
                i=mid+1;
        }
        
        return res;
    }
}