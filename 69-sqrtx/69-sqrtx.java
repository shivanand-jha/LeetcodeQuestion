class Solution {
    public int mySqrt(int x) {
  if(x == 1 || x == 0){
        return x;
    }    
    
    int low = 1, high = x/2;
    
    while(low <= high){
        
        long mid = low + (high - low) / 2;
        
        if(mid * mid == x){
            return (int)mid;
        }
		else if(mid * mid > x){
            high = (int)mid - 1;
        } 
		else {
            low = (int)mid + 1;
        }
    }
    
    return high;
    }
}