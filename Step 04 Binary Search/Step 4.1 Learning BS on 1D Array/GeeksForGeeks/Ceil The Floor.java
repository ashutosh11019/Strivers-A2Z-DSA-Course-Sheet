class Solve {
   Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        int max=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                max=Math.max(max,arr[i]);
            }
            if(arr[i]>=x){
                min=Math.min(min,arr[i]);
            }
        }
        if(min==Integer.MAX_VALUE)
        min=-1;
        Pair p=new Pair(max,min);
        return p;
    } 
}