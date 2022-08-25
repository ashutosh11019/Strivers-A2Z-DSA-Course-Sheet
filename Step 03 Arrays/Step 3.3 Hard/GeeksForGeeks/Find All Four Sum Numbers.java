class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = arr.length;
        if(arr==null || n==0) return list;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=k-arr[i]-arr[j];
                int l=j+1,h=n-1;
                while(l<h){
                    int t=arr[l]+arr[h];
                    if(t<sum) l++;
                    else if(t>sum) h--;
                    else{
                        ArrayList<Integer> ar = new ArrayList<>();
                        ar.add(arr[i]);
                        ar.add(arr[j]);
                        ar.add(arr[l]);
                        ar.add(arr[h]);
                        list.add(ar);
                        
                        while(l<h && arr[l]==ar.get(2)) l++;
                        while(l<h && arr[h]==ar.get(3)) h--;
                    }
                }
                while(j+1<n && arr[j+1]==arr[j]) j++;
            }
            while(i+1<n && arr[i+1]==arr[i]) i++;
        }
        return list;
    }
}