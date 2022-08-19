// SORT THE 0S,1S,2S
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zeros = 0,ones = 0,twos = 0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                zeros++;
            }
            if(a[i]==1){
                ones++;
            }
            if(a[i]==2){
                twos++;
            }
        }
        for(int i=0;i<n;i++){
           if(zeros>0){
               a[i] = 0;
               zeros--;
           } 
           else if(ones>0){
               a[i] = 1;
               ones--;
           }
           else{
               a[i] =2;
               twos--;
           }
        }
        
    }
}
