import java.util.*;
import java.lang.*;
import java.io.*;
class Pair{
    int first, second;
    Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Sorted implements Comparator<Pair>{
    @Override
    public int compare(Pair p1, Pair p2){
        if(p1.second > p2.second){
            return -1;
        }else if(p1.second < p2.second){
            return 1;
        }else{
            if(p1.first > p2.first) return 1;
            else return -1;
        }
    }
}
class GFG{
    public static void main (String[] args){
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                map.put(num,map.getOrDefault(num,0)+1);
            }
            List<Pair> arr = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                arr.add(new Pair(entry.getKey(), entry.getValue()));
            }
            Collections.sort(arr, new Sorted());
            int ans[] = new int[n];
            int j=0;
            for(int i=0;i<arr.size();i++){
                Pair p = arr.get(i);
                ans[j]=p.first;
                ans[j+p.second-1]=p.first;
                j=j+p.second;
            }
            for(int i=0;i<n;i++){
                if(ans[i]==0){
                    ans[i]=ans[i-1];
                    System.out.print(ans[i-1]+" ");
                }
                else System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}