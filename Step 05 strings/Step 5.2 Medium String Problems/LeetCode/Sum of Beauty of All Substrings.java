class Solution {
    public int beautySum(String s) {
        int n = s.length(),c=0;
        for(int i=0;i<n;i++)
        {
            int [] arr = new int[26];
            for(int j=i;j<n;j++)
            {
                arr[s.charAt(j)-'a']++;                
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int k=0;k<26;k++)
                {
                    if(arr[k]!=0 && arr[k]>max)    max = arr[k];
                    if(arr[k]!=0 && arr[k]<min)    min = arr[k];
                }
                c += max-min;
            }
        }
        return c;
    }
}