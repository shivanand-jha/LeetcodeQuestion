class Solution {
    public boolean isHappy(int n) {
     	int s = n,f = n; 
        
        do{
            s = compute(s); 
            f = compute(compute(f)); 
            if(s == 1)return true; 
        }while(s != f); 
        
        return false;   
    }
    public int compute(int n){
        int s = 0;
        while(n != 0){
            s += (n%10)*(n%10);
            n = n/10;
        }
        return s;
    }
}