//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.reverseString(s));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverseString(String s)
    {
        String ans="";
        int present[]=new int[26];
        Arrays.fill(present,0);
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' || present[s.charAt(i)-'A']==1) 
                continue;
            present[s.charAt(i)-'A']=1;
            ans+=s.charAt(i);
        }
        return ans;
    }
}