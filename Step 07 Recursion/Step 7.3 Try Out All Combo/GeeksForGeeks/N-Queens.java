class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] vis = new int[n][n];
        solve(ans, vis, 0, n);
        return ans;
    }
    
    static boolean check(int[][] vis, int i, int j, int n){
        int x=i, y=j;
        while(x>=0){
            if(vis[x][y]==1) return false;
            x--;
        }
        x=i; y=j;
        if(x>0){
            while(x>=0 && y<n){
                if(vis[x][y]==1) return false;
                x--;
                y++;
            }
        }
        x=i; y=j;
        if(y>0){
            while(x>=0 && y>=0){
                if(vis[x][y]==1) return false;
                x--;
                y--;
            }
        }
        return true;
    }
    
    static void solve(ArrayList<ArrayList<Integer>> ans, int[][] vis, int i, int n){
        if(i==n){
            ArrayList<Integer> sub = new ArrayList<>();
            for(int i1=0;i1<n;i1++){
                for(int j1=0;j1<n;j1++){
                    if(vis[i1][j1]==1) sub.add(j1+1);
                }
            }
            ans.add(sub);
            return;
        }
        for(int j=0;j<n;j++){
            if(check(vis, i, j, n)){
                vis[i][j]=1;
                solve(ans, vis, i+1, n);
                vis[i][j]=0;
            }
        }
    }
}