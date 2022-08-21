
//Given a binary sorted non-increasing array arr of size N. You need to print the count of 1 in the binary array.

//Try to solve the problem using binary search
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
   static int countones(int[] arr,int n){
      int low = 0;
      int high = n-1;
      while(low<=high){
        int mid = (low+high)/2;
        if(( mid==high || arr[mid+1]==0) && arr[mid]==1 ){
          return mid+1;
        }
        else if(arr[mid]==0){
          high = mid-1;
        }
        else{
          low = mid+1;
        }
      }
     return 0;
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      int ans = countones(arr,n);
      System.out.println(ans);
      
	}
}
