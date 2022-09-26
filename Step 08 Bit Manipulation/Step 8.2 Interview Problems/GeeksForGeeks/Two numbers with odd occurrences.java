class Solution
{
    public int[] twoOddNum(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int res[]=new int[2];
        int z=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            res[z++]=arr[i];
            else if(arr[i]==arr[i+1])
            i++;
        }
        if(arr[n-1]!=arr[n-2])
        res[z++]=arr[n-1];
        int temp=res[0];
        res[0]=res[1];
        res[1]=temp;
        return res;
    }
}