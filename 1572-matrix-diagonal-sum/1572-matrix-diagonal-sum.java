class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int len = mat.length; 
        
        for(int i=0;i<mat.length;i++)
        {
              sum+= mat[i][i] + mat[i][len-i-1];
                
        }
        if(len%2!=0)
        sum-=mat[len/2][len/2];
        return sum;
    }
}