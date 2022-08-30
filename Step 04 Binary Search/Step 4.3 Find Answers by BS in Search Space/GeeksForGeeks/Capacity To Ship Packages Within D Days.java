class Solution {
    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
        int mini=0,maxi=0,res=0;
        for(int i=0;i<N;i++){
            mini=Math.max(mini,arr[i]);
            maxi+=arr[i];
        }
        while(mini<=maxi){
            int cap=mini+(maxi-mini)/2;
            int days=D,sum=0,i=0;
            while(i<N){
                sum+=arr[i];
                if(sum>cap){
                   days--;
                   if(days==0)
                   break;
                   sum=0;
                }
                else i++;
            }
            if(days==0) mini=cap+1;
            else{
                res=cap;
                maxi=cap-1;
            }
        }
        return res;
    }
};