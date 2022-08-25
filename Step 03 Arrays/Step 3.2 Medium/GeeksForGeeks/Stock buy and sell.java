class Solution {
    public void stockBuySell(int[] price, int n) {
        // code here
        int l = 0;
        while(l<n-1 && price[l] > price[l+1]){
            l++;
        }
        if(l==n-1){
            System.out.println("No Profit");
            return;
        }
        int bi = 0;
        int si = 0;
        for(int i=1; i<n; i++){
            if(price[i] > price[i-1]){
                si = si + 1;
            }
            else{
                if(price[si]-price[bi] > 0){
                    System.out.print("(" + bi + " " + si + ") ");
                }
                bi = i;
                si = i;
            }
        }
        if(bi < n-2 && price[n-1] < price[n-2])
            System.out.print("(" + bi + " " + si + ") ");
        else if(price[n-1] > price[n-2] && bi <n-1){
            System.out.print("(" + bi + " " + si + ") ");
        }
        System.out.println();
    }
}