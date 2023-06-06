class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int a=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++)
        {
                a=arr[1]-arr[0];
                if(arr[i+1]-arr[i]!=a)
                {
                    return false;
                }
        }
        return true;
    }
}