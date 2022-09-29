class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	int i = 0, j = n - 1;
        while (i < j) {
            if (M[j][i] == 1)
                j--;
            else
                i++;
        }
        int candidate = i;
        for (i = 0; i < n; i++) {
            if (i != candidate) {
                if (M[i][candidate] == 0 || M[candidate][i] == 1)
                    return -1;
            }
        }
        return candidate;
    }
}