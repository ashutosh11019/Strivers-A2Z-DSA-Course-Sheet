class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> a = new ArrayList<>();
        int m= matrix.length;
        int n=matrix[0].length;
        int r1=0;
        int c1=0;
        int r2=m-1;
        int c2=n-1;
        while(r1<=r2&&c1<=c2){
            for(int i=c1;i<=c2;i++){
                a.add(matrix[r1][i]);
            }
            r1++;
            for(int i=r1;i<=r2;i++){
                a.add(matrix[i][c2]);
            }
            c2--;
            if(r1<=r2){
                for(int i=c2;i>=c1;i--){
                a.add(matrix[r2][i]);
                }    
            }
            r2--;
            if(c1<=c2){
                for(int i=r2;i>=r1;i--){
                a.add(matrix[i][c1]);
                }    
            }
            c1++;
        }
        return a;
    }
}