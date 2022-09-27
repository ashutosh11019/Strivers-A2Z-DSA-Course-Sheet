class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int n){
        // code here
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                arr.add(i);
        }
        return arr;
    }
}