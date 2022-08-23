class Main{
	public static int reversenumber(int x){
		int num=0, n=Math.abs(x);
		while(n>0){
			int rem = n%10;
			num = (num*10) + rem;
			n=n/10;
		}
        if(x<0) num=-num;
		return num;
	}
}