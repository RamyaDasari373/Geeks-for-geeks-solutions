//Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        //o(n^2)
	   // ArrayList<Integer> al = new ArrayList<Integer>();
	   // for(int i=0;i<arr.length;i++){
	   //     int count = 0;
	   //     for(int j=i+1;j<arr.length;j++){
	   //         if(arr[i]>=arr[j]){
	   //             count++;
	   //         }
	   //     }
	   //     if(count == (arr.length-i-1)){
	   //         al.add(arr[i]);
	   //     }
	   // }
	   // return al;
	   //o(n)
	   ArrayList<Integer> al = new ArrayList<Integer>();
	   int max = Integer.MIN_VALUE;
	   for(int i=n-1;i>=0;i--){
	       if(arr[i]>=max){
	           max = arr[i];
	           al.add(max);
	       }
	   }
	   Collections.reverse(al);
	   return al;
    }
}
