class Main{
	public static boolean linearsearch(int arr[], int n, int val){
		for(int i=0;i<n;i++){
			if(arr[i]==val) return true;
		}
		return false;
	}
}