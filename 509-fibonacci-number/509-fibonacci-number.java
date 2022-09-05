class Solution {
    public int fib(int n) {
        //top-Down approach and memoziation
        int[] mem = new int[n+1];
        return fibn(mem,n);
    }
   public static int fibn(int[] mem, int n)
    {
        if(mem[n]==0)
        {
            if(n<2)
            {
                mem[n]=n;
            }
        else{
            int left = fibn(mem,n-1);
            int right = fibn(mem,n-2);
            mem[n] = left+right;
        }
        }
       return mem[n];
    }
}