class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<Integer>();
        HashSet<Integer> col = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        System.out.println(col);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row.contains(i)){
                    matrix[i][j]=0;
                }else if(col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}