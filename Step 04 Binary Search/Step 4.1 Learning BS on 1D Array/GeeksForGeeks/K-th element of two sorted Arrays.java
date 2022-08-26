class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i=0,j=0;
        long ans=-1;
        while(i<n && j<m){
            // System.out.println(arr1[i]+" "+arr2[j]+" "+k);
            if(arr1[i]<arr2[j]){
                ans=arr1[i];
                k--;
                i++;
                
            }else{
                ans=arr2[j];
                k--;
                j++;
                
            }
            // System.out.println(arr1[i]+" "+arr2[j]+" "+k);
            if(k==0) break;
        }
        if(i<n){
            while(k>0){
                i=i+k-1;
                k=0;
                ans=arr1[i];
            }
        }
        if(j<m){
            while(k>0){
                j=j+k-1;
                k=0;
                ans=arr2[j];
            }
        }
        
        return ans;
    }
}