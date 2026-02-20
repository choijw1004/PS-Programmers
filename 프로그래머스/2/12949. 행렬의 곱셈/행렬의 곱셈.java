class Solution {
    public int[][] solution(int[][] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        int k = B[0].length;
        
        int[][] ans = new int[n][k];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    ans[i][j] += A[i][l] * B[l][j];
                }
            }
        }
        
        return ans;
    }
}