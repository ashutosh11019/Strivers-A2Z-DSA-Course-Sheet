class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    public static long merge(long arr[], long l, long m, long r)
    {
        long count=0;
        long n1 = m - l + 1;
        long n2 = r - m;
        long L[] = new long[(int)n1];
        long R[] = new long[(int)n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[(int)l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[(int)m + 1 + j];
        int i = 0, j = 0;
        long k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[(int)k] = L[i];
                i++;
            }
            else {
                arr[(int)k] = R[j];
                j++;
                count+=(n1-i);
            }
            k++;
        }
        while (i < n1) {
            arr[(int)k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[(int)k] = R[j];
            j++;
            k++;
        }
        return count;
    }
    public static long sort(long arr[], long l, long r)
    {
        long count=0;
        if (l < r) {
            long m =l+ (r-l)/2;
            count+=sort(arr, l, m);
            count+=sort(arr, m + 1, r);
            count+=merge(arr, l, m, r);
        }
        return count;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return sort(arr, 0, arr.length - 1);
        
    }
}