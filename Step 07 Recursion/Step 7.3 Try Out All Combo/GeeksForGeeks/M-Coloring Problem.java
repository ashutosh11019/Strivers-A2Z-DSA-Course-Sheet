//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        ArrayList<ArrayList<Integer>> edge=new ArrayList<>();
        for(int i=0;i<n;i++)edge.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j]==true){                   
                    edge.get(i).add(j);
                    edge.get(j).add(i);
                }
            }
        }
        int col[]=new int[n];
        if(solve(0,edge,col,n,m)==true)return true;
        else return false;
    }
    
    public static boolean isPossible(int node,ArrayList<ArrayList<Integer>> edge,int col[],int i){
        for(int it: edge.get(node)){
            if(col[it]==i)return false;
        }
        return true;
    }
    
    public static boolean solve(int node,  ArrayList<ArrayList<Integer>> edge,int col[],int n,int m){
        if(node==n)return true;
        for(int i=1;i<=m;i++){
            if(isPossible(node,edge,col,i)==true){
                col[node]=i;
                if(solve(node+1,edge,col,n,m)==true)  return true;
                col[node]=0;
            }
        }
        return false;
    }
}