class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashSet<Character> hs = new HashSet<>();
        int[] count = new int[26];
        int ans=-1, c=0, n=s.length(), j=0;
        for(int i=0;i<n;i++){
            hs.add(s.charAt(i));
            count[s.charAt(i)-'a']++;
            while(hs.size()>k){
                count[s.charAt(j)-'a']--;
                if(count[s.charAt(j)-'a']==0) hs.remove(s.charAt(j));
                j++;
            }
            if(hs.size()==k) ans=Math.max(ans, i-j+1);
        }
        return ans;
    }
}