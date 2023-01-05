class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        bTrack(ans,cur,n,k,1);
        return ans;
    }
    private void bTrack(List<List<Integer>> ans , List<Integer> a , int total , int size,int st)
    {
        if(total==0 && a.size()==size)
        {
            ans.add(new ArrayList<Integer>(a));
            return;
        }
        else if(a.size()>size)
        {
            return;
        }
        else
        {
            for(int i=st;i<=9; i++)
            {
                a.add(i);
                bTrack(ans,a,total-i,size,i+1);
                a.remove(a.size()-1);
            }
        }

    }
}