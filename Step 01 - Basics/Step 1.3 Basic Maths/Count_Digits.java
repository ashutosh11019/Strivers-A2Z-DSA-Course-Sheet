class Count_Digits{
	
	static int countdigit(int N){
		int c=0;
		while(N>0){
			c++;
			N=N/10;
		}
		return c;
	}
}