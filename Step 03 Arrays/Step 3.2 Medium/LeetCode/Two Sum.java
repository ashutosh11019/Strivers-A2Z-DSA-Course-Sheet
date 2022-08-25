class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum = target-nums[i];
            if(map.containsKey(sum)){
                res[0]=map.get(sum);
                res[1]=i;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}