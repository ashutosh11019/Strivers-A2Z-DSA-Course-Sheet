class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        boolean[] b = new boolean[N+1];
        Arrays.fill(b,true);
        for(int i=2; i*i<=N; i++){
            for(int j = i*2; j<=N; j+=i) b[j] = false;
        }
        for(int i=2 ; i<=N; i++){
            if(b[i] == true && N%i == 0) al.add(i);
        }
        int[] arr = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}