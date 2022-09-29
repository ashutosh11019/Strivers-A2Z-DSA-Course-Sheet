class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        arr.push(0);
        int[] ans = new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            int res=1;
            while(!arr.isEmpty() && price[arr.peek()]<=price[i]){
                res+=ans[arr.pop()];
            }
            ans[i]=res;
            arr.push(i);
        }
        return ans;
    }
    
}