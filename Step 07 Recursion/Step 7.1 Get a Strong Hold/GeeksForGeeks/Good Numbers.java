class Solution {
    ArrayList<Integer> goodNumbers(int L, int R, int D) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=L;i<=R;i++){
            int sum=0, n=i, flag=0, f=1;
            while(n>0){
                if(f==1){
                    int rem = n%10;
                    if(rem==D){
                        flag=1;
                        break;
                    }
                    sum+=rem;
                    n=n/10;
                    f=0;
                }else{
                    int rem = n%10;
                    if(rem==D){
                        flag=1;
                        break;
                    }
                    if(rem<=sum){
                        flag=1;
                        break;
                    }
                    sum+=rem;
                    n=n/10;
                }
            }
            if(flag==0) ans.add(i);
        }
        return ans;
    }
}