class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int start=0;
        int end=mat[0].length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=0;
            for(int i=1; i<mat.length; i++){
                if(mat[row][mid]<mat[i][mid])
                row=i;  
            }
            if( (mid==0||mat[row][mid]>mat[row][mid-1]) && (mid==end||mat[row][mid]>mat[row][mid+1]))
                return new int[]{row,mid};
            else if(mat[row][mid]<mat[row][mid+1])
                start=mid+1;
            else
                end=mid-1;
        }
        return new int[]{-1,-1};
    }
}