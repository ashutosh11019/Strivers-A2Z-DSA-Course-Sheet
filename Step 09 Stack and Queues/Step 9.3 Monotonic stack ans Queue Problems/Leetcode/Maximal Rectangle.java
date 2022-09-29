class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int row = matrix.length, col = matrix[0].length;
        int ans = 0;
        int[][] record = new int[col][3];
        for (int i = 0; i < col; i++) {
        	record[i][0] = 0;
        	record[i][1] = col;
        	record[i][2] = 0;
        }
        for (int i = 0; i < row; i++) {
        	for (int j = 0; j < col; j++) {
				if (matrix[i][j] == '1') {
					int left = j, right = j+1, k = j+1;
					for (; k < col && matrix[i][k] == '1'; k++);
					right = k;
					for (k = left; k < right; k++) {
						record[k][0] = Math.max(record[k][0], left);
						record[k][1] = Math.min(record[k][1], right);
						record[k][2] = record[k][2]+1;
						if ((record[k][1]-record[k][0])*record[k][2] > ans) ans = (record[k][1]-record[k][0])*record[k][2];
					}
					j = right-1;
				}
				else {
					record[j][0] = 0;
					record[j][1] = col;
					record[j][2] = 0;
				}
			}
		}
        return ans;
    }
}