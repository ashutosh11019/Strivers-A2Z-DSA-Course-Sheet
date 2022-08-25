class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   int c=0,l=0;
        Arrays.sort(arr);
        for (int i=0;i<N-1;i++) {
            if(arr[i]==arr[i+1]) continue;
            if(arr[i]+1==arr[i+1]) c++;
            else {
                if(c+1>l) l=c+1;
                c=0;
            }
        }
        if(c+1>l) l=c+1;
        return l;
	}
}