class Solution{
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=0, sum=0;
        map.put(0,-1);
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(map.containsKey(sum-K)) ans=Math.max(ans, i-map.get(sum-K));
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return ans;
    }
}