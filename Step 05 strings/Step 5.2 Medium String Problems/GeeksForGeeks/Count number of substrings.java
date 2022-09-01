class Solution
{
    long substrCount (String S, int K) {
        // your code here
        return helper(S,K) - helper(S,K-1);
    }
    
    long helper(String S, int K){
        long[] ans = new long[26];
        long s=0, c=0, d=0;
        for(int i=0;i<S.length();i++){
            if(ans[S.charAt(i)-'a']==0) d++;
            ans[S.charAt(i)-'a']++;
            while(d>K){
                ans[S.charAt((int)s)-'a']--;
                if(ans[S.charAt((int)s)-'a']==0) d--;
                s++;
            }
            if(d<=K) c=c+i-s+1;
        }
        return c;
    }
}