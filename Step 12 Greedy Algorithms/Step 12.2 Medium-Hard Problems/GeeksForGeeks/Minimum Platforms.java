class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
         // add your code here
         Arrays.sort(arr);
         Arrays.sort(dep);
         int max=0;
         int count=0;
         int i=0;
         int j=0;
         while(i<n)
         {
             if(dep[j]>=arr[i])
             {
                 count++;
                 if(count>max)
                 {
                     max=count;
                 }
                 i++;
             }
             else
             {
                 count--;
                 j++;
             }
             
         }
         return max;
    }
    
}