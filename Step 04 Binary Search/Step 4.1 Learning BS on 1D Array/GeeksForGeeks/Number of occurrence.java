class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int f = -1 , l = -1 , b = 0 , e = n-1;

        while(b<e)
        {
           int m = b+(e-b)/2;
           if(arr[m]>=x){
               e=m;
           }
           else{
               b = m+1;
           }
        }
        if(arr[b] == x)
        {
           f=b ;
        }else{
           return 0;
        }
       
        b = f; e = n-1;
        
        while(b<e){
            int m = b+(e-b)/2;
            if(arr[m] == x)
            {
                   b = m;
                if(arr[e] ==x)
                  {
                     b = e;
                 }
            else{
                e--;
                }
            }
            else{
                e = m-1;
            }
                
        }
       l = b ;
       return l-f+1;
        
    }
}