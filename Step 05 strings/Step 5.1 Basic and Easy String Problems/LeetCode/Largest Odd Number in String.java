class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            int no = Integer.parseInt(sb.charAt(i)+"");
            if(no%2==1) break;
            sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}