class pair{
    int start,end;
    public pair(int s,int e){
        start=s;
        end=e;
    }
}

class comp implements Comparator<pair>{
    public int compare(pair a,pair b){
        return a.end-b.end;
    }
}

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<pair> ans = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            ans.add(new pair(start[i],end[i]));
        }
       
        Collections.sort(ans,new comp());
       
        int i=0,j=1,count=1;
        while(j<n){
            if(ans.get(i).end<ans.get(j).start){
                count++;
                i=j;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
}