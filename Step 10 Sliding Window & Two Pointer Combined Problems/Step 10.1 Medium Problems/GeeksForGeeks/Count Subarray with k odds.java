class Solution {
    public static int countSubarray(int n, int[] nums, int k) {
        // code here
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) nums[i]=0;
            else nums[i]=1;
        }
        int[] P = new int[n + 1];
        for (int i = 0; i < n; ++i) P[i+1] = P[i] + nums[i];
        Map<Integer, Integer> count = new HashMap();
        int ans = 0;
        for (int x: P) {
            ans += count.getOrDefault(x, 0);
            count.put(x+k, count.getOrDefault(x+k, 0) + 1);
        }
        return ans;
    }
}