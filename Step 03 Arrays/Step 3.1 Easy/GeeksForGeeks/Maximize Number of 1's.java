class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        // code here
        int i = 0 , j;
        for(j = 0 ; j < n ; j++){
            if(arr[j] == 0) m--;
            if(m < 0 && arr[i++] == 0) m++;
        }
        return j-i;
    }
}