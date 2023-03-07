class Solution {
    public long minimumTime(int[] time, int trips) {
        if(time ==null)return 0;
        if(time.length==1)return (long)trips*time[0];
        long min = Long.MAX_VALUE;
        for(int i=0; i<time.length; i++)
        {
            if(min>time[i])
            {
                min = time[i];
            }
        }
        long low = min;
        long high = trips*min;
        while(low<high)
        {
            long mid = low+(high-low)/2;
            if(isValid(mid,time,trips))
            {
                high=mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public boolean isValid(long mid , int[] time , int trips)
    {
        long count = 0;
        for(int x:time)
        {
            count += mid/x;
        }
        if(count>=trips)
            return true;
        return false;
    }
}