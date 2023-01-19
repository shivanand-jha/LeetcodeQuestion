//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        int moves=0;
        while(Math.max(C,D)<Math.max(A,B))
        {
            if(A>=B) A/=2;
            else B/=2;
            moves++;
        }
        while(Math.min(C,D)<Math.min(A,B))
        {
            if(A<=B) A/=2;
            else B/=2;
            moves++;
        }
        return moves;
    }
   
}
