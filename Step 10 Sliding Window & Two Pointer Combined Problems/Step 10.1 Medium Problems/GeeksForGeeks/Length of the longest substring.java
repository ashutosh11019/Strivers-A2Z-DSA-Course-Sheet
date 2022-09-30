class Solution{
    int longestUniqueSubsttr(String S){
        int n = S.length(), ans=0, c=0, i=0, j=0;
        int[] count = new int[26];
        while(i<n && j<n){
            char ch = S.charAt(j);
            if(count[ch-'a']==0){
                count[ch-'a']++;
                j++;
                c=j-i;
                ans=Math.max(ans,c);
            }else{
                count[S.charAt(i)-'a']--;
                i++;
            }
        }
        return ans;
    }
}