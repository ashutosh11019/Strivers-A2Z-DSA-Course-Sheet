class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        Arrays.sort(Intervals,(a,b)-> { return a[0]-b[0];});
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<Intervals.length;i++){
            for(int j=0;j<2;j++){
                q.add(Intervals[i][j]);
            }
        }
        int x=0,y=0,c=0;
        while(!q.isEmpty()){
            x=q.remove();
            y=q.remove();
            if(q.isEmpty()){
                list.add(x);
                list.add(y);
                break;
            }
            while(y>=q.element()){
                q.remove();
                int m=q.remove();
                if(m>y) y=m;
                if(q.isEmpty()){
                    list.add(x);
                    list.add(y);
                    c=1;
                    break;
                }
            }
            if(c==1) break;
            list.add(x);
            list.add(y);
        }
        int arr[][] = new int[list.size()/2][2];
        int i=0,j=0;
        for(int k=0;k<list.size();k=k+2){
            arr[i][0]=list.get(k);
            arr[i][1]=list.get(k+1);
            i++;
        }
        return arr;
    }
}