class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        int start = 0;
        int sum = 0;
        int flag =0;
        if(s>0){
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            while(sum > s){
                sum = sum-arr[start];
                start++;
            }
            if(sum == s){
                al.add(start+1);
                al.add(i+1);
                flag = 1;
                break;
            }
        }
        }
        if(s <= 0){
            al.add(-1);
        }
        if(al.isEmpty()){
            al.add(-1);
        }
        return al;
        
    }
}
