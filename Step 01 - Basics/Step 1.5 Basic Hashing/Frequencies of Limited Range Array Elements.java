class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int[] result = new int[N+1];
        for(int i = 0 ; i< N ; i++){
           if(arr[i] <= N){
               result[arr[i]] += 1;
           }
        }
        for(int i = 0 ;i<N ;i++)
          arr[i] = result[i+1];
        
    }
}