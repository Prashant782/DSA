//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList <Integer> res = new ArrayList <Integer> (0);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        
        //iterating over first k elements or first window of array.
        for(i  = 0; i < k ; i++)
        {
            //for every element, the previously smaller elements 
            //are useless so removing them from deque.
            while(dq.isEmpty() == false && arr[i] >= arr[dq.peekLast()])
              dq.pollLast();
            
            //adding new element at back of deque.  
            dq.add(i);
        }
        
        //iterating over the rest of the elements.
        for(; i < n; i++)
        {
            //the element at the front of the deque is the largest 
            //element of previous window, so adding it to the list.
            res.add(arr[dq.peek()]);
            
            //removing the elements which are out of this window.
            while(dq.isEmpty() == false && (dq.peekFirst() <= i-k))
               dq.pollFirst();
            
            //removing all elements smaller than the element being  
            //added currently (removing useless elements). 
            while(dq.isEmpty() == false && (arr[i] >= arr[dq.peekLast()]))
                dq.pollLast();
            
            //adding new element at back of deque.    
            dq.add(i);
        }
        
        //the element at the front of the deque is the largest 
        //element of last window, so adding it to the list.
        res.add(arr[dq.peek()]);
        dq.pollFirst();
           
        //returning the list.
        return res;
          
    }
}