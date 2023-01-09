//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int b){
        // code here
            if(b<=1){
                return 0;
            }
            else if (b==2)
                return 1;
            for (int j = 2; j<=Math.sqrt(b); ++j) {
                if (b%j == 0) {
                    return 0;
                }
            }
           return 1;
    }
}