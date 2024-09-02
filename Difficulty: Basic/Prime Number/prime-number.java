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
    static int isPrime(int N){
        // code here
       if(N == 1) // if N = 1 return 0
            return 0;
        for(int i=2;i*i<=N;i++) // loop from 2 to sqrt(N)
            if(N%i==0) // if N is divisble by any other number return 0 
                return 0;
        return 1; 
    }
}