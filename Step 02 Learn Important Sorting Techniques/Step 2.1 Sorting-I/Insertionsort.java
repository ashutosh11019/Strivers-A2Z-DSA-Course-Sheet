class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int n=arr.length;
       insertionSort(arr, n);
       return;
  }
  //Function to sort the array using insertion sort algorithm.
  public static void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++){
          int num=arr[i], j=i-1;
          while(j>=0 && arr[j]>num){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=num;
      }
  }
}