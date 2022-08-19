//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int array_sum = 0;
        int main_sum = 0;
        for(int i=0;i<n-1;i++){
            array_sum = array_sum + array[i];
            
        }
        //System.out.println(array_sum);
        for(int i=1;i<=n;i++){
            main_sum = main_sum+i;
        }
        //System.out.println(main_sum);
        int result = main_sum - array_sum;
        return result;
        
    }
}
