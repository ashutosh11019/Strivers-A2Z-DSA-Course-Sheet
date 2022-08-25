class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int val=0,r=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1) c++;
            }
            if(val<c){
                val=c;
                r=i;
            }
        }
        if(val==0) r=-1;
        return r;
    }
}