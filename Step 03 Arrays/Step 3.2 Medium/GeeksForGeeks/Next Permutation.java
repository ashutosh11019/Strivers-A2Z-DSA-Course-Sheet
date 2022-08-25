class Solution{
    static void swap(int a, int b, int arr[]){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int index=-1;
        for(int i=N-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(index==-1){
            for(int i=N-1;i>=0;i--) list.add(arr[i]);
        }else{
            int ind=-1;
            for(int i=index+1;i<N;i++){
                if(arr[index]<arr[i] && ind<i){
                    ind=i;
                }
            }
            swap(index,ind,arr);
            index=index+1;
            int n=N-1;
            while(index<n){
                swap(index,n,arr);
                index++;
                n--;
            }
            for(int i=0;i<N;i++) list.add(arr[i]);
        }
        return list;
    }
}