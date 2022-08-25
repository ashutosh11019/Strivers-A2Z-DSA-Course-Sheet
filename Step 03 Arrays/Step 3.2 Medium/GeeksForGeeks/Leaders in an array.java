class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> array = new ArrayList<>();
        int max = arr[n-1];
        array.add(max);
        for(int i=n-2;i>=0;i--){
            if(max<=arr[i]){
                max=arr[i];
                array.add(max);
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=array.size()-1;i>=0;i--){
            a.add(array.get(i));
        }
        return a;
    }
}