class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) arr1.add(arr[i]);
            else arr2.add(arr[i]);
        }
        int i=0, j=0, k=0;
        while(j<arr1.size() && k<arr2.size()){
            arr[i]=arr2.get(k);
            i++;
            k++;
            arr[i]=arr1.get(j);
            i++;
            j++;
        }
        while(k<arr2.size()){
            arr[i]=arr2.get(k);
            i++;
            k++;
        }
         while(j<arr1.size()){
            arr[i]=arr1.get(j);
            i++;
            j++;
        }
    }
}