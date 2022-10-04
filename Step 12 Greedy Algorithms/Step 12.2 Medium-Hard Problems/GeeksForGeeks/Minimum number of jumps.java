class Solution{
    static int minJumps(int[] arr){
        // your code here
        int jump=1;
        int n = arr.length;
        if(n<=1) return 0;
        if(arr[0]==0) return -1;
        int max=arr[0];
        int step=arr[0];
        for(int i=1;i<n;i++){
            if(i==arr.length-1) return jump;
            max=Math.max(max,i+arr[i]);
            step--;
            if(step==0){
                jump++;
                if(i>=max) return -1;
                step=max-i;
            }
        }
        return jump;
    }
}