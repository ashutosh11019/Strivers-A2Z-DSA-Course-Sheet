class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String ans="";
        int l=arr[0].length();
        for(int j=1;j<n;j++){
            if(l>arr[j].length()){
                l=arr[j].length();
            }
        }
        for(int i=0;i<l;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[j].charAt(i) == arr[0].charAt(i)){
                    c++;
                    continue;
                }
            }
            if(c==n) ans+=arr[0].charAt(i);
            else break;
        }
        if(ans.length()==0) return "-1";
        return ans;
    }
}