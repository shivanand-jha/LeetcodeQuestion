class Solution {
    public boolean isHappy(int n) {
     	List<Integer> ans = new ArrayList<>();
        // int t = 0;
        while(n!=1)
        {
           int t = n;
            n = 0;
            while(t>0)
            {
                n += (t%10) * (t%10) ;
                t /=10;
            }
            if(ans.contains(n))
            {
                return false;
            }
            else
            {
                ans.add(n);
            }
        }
        return true;
    }
}