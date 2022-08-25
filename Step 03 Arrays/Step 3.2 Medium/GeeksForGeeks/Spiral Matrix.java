class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int sr=0,er=n-1,sc=0,ec=m-1;
        int ans=0,count=1;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                if(count==k) ans=a[sr][i];
                count++; 
            }
            sr++;
            
            for(int i=sr;i<=er;i++){
                if(count==k) ans=a[i][ec];
                count++;  
            }
            ec--;
            
            if(sr<=er){
                for(int i=ec;i>=sc;i--){
                    if(count==k) ans=a[er][i];
                    count++; 
                }
                er--;
            }
            
            if(sc<=ec){
                for(int i=er;i>=sr;i--){
                    if(count==k) ans=a[i][sc];
                    count++; 
                }
                sc++;
            }
        }
        return ans;
	}
	
}