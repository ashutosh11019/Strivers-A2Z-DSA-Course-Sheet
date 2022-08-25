class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }else{
                int c = map.get(a[i]);
                map.put(a[i],c+1);
            }
        }
        int num = -1;
        int n = size/2;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>n){
                num = entry.getKey();
            }
        }
        return num;
    }
}