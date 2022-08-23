class Main{
	static Long gcd(Long num1, Long num2){
        if (num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}