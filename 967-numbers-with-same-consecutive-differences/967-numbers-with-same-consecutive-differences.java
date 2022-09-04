class Solution {
    List<Integer> res;
    public int[] numsSameConsecDiff(int n, int k) {
        res = new ArrayList<>();
        
        // Taking all possible cases for first digit from 1-9
        for(int i=1; i<=9; i++)solve(i,1,n,k);
        
        // Converting List to Array
        int len = res.size();
        int[] arr  = new int[len];
        for(int i=0; i<len; i++)arr[i] = res.get(i);
        return arr;
    }
    
    private void solve(int item, int i, int n, int k){
        if(i==n){
            res.add(item);
            return;
        }
        
        // To check for +k and -k results with the last digit
        int a = item % 10;
        
        // If the absolute difference is zero, then should be single recursive call else there will be duplicate values in the result
        if(k == 0){
            int temp = (item*10) + a;
            solve(temp,i+1,n,k);
        }
        else{
            
            // Check for +k and -k values and proceed accordingly
            if((a+k)<=9){
                int temp = (item*10) + (a+k);
                solve(temp,i+1,n,k);
            }
            if((a-k)>=0){
                int temp = (item*10) + (a-k);
                solve(temp,i+1,n,k);
            }    
        }
        
    }
}
