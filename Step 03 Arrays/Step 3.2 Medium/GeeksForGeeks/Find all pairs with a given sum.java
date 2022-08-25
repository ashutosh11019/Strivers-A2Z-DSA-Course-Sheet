class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        ArrayList<Long> arr2 = new ArrayList<>();
        for(int i=0;i<M;i++){
            arr2.add(B[i]);
        }
        int j=0,c=0;
        
        for(int i=0;i<N;i++){
            long val=X-A[i];
            if(arr2.contains(val)){
                c++;
            }
        }
        pair p[] = new pair[c];
        for(int i=0;i<N;i++){
            long val=X-A[i];
            if(arr2.contains(val)){
                p[j]=new pair(A[i],val);
                j++;
            }
        }
        Arrays.sort(p, new Comparator<pair>() {
            @Override public int compare(pair p1, pair p2)
            {
                return (int)p1.first - (int)p2.first;
            }
        });
        return p;
    }
}