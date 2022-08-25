class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> pre = null;
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.add(1);
                }else{
                    list.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = list;
            arr.add(list);
        }
        return arr;
    }
}