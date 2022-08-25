class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]>0){
                arr[i]=arr[j];
                i++;
            }
        }
        for(int j=i;j<n;j++){
            arr[j]=0;
        }
    }
}