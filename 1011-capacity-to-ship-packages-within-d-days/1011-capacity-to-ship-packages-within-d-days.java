class Solution {
    public int shipWithinDays(int[] arr, int k) {
        int left=Integer.MIN_VALUE , right=0;
        for (int x :
                arr) {
            left = Math.max(left, x);
            right += x;
        }
        while (left<right)
        {
            int mid = (left+right)/2;
            int daysReq =1,currWeight=0;
            for (int weight : arr) {
                if(currWeight+weight>mid)
                {
                    daysReq +=1;
                    currWeight = 0;
                }
                currWeight += weight;
            }
            if (daysReq > k) { left = mid+1;}
            else {
                right = mid;
            }
        }
        return left;
    }
}