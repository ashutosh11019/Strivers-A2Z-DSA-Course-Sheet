// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static Boolean isPalin(String s){
       int j=0;
       for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)!=s.charAt(j++)){
               return false;
           }
       }
       return true;
    }
    
    static String longestPalin(String S){
       // code here
       int s=0,e=0;
       int[] min=new int[2];
       Boolean set=false;
       String r="", check="";
       for(int i=0;i<S.length();i++){
           check="";
           for(int j=i;j<S.length();j++){
               check+=S.charAt(j);
               if(isPalin(check)){
                   if(!set){
                       min[0]=i;
                       min[1]=j;
                       set=true;
                   }
                   else if(j-i+1 > min[1]-min[0]+1){
                       min[0]=i;
                       min[1]=j;
                   }
               }
           }
       }
       for(int i=min[0];i<=min[1];i++){
           r+=S.charAt(i);
       }
       return r;
    }
}