class Solution{
    static List<Integer> minPartition(int n)
    {
        // code here
        int[] notes={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        List<Integer> list = new ArrayList<>();
        int i=notes.length-1;
        while(n>0){
            if(notes[i]<=n){
                n-=notes[i];
                list.add(notes[i]);
            }else{
                i--;
            }
        }
        return list;
    }
}