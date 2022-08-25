class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int max=0,sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)==false){
                map.put(sum,i);
            }else{
                max=Math.max(max,i-map.get(sum));
            }
        }
        return max;
    }
}