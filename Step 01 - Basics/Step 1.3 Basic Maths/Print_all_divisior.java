class Solution{
    static long sumOfDivisors(int N){
        // code here
        long sum=0;
        for(int i=1;i<=N;i++){
            sum+=(N/i)*i;
        }
        return sum;
    }

    static void printDivisorsBruteForce(int n){
        System.out.println("The Divisors of "+n+" are:");
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                System.out.print(i + " ");
            
        System.out.println();
    }
}