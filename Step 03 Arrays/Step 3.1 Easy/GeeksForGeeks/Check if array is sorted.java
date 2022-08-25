class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}