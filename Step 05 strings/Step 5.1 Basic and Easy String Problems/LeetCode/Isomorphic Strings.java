class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mappingDictStoT = new int[256];
        Arrays.fill(mappingDictStoT, -1);
        
        int[] mappingDictTtoS = new int[256];
        Arrays.fill(mappingDictTtoS, -1);
        
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                mappingDictStoT[c1] = c2;
                mappingDictTtoS[c2] = c1;
            }
            else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
                return false;
            }
        }
        
        return true;
    }
}