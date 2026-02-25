import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n][m];
        boolean[][] isPuddle = new boolean[n][m];
        
        for (int[] p : puddles) {
            isPuddle[p[1]-1][p[0]-1] = true; 
        }
        
        for (int i = 0; i < n; i++) {
            if (isPuddle[i][0]) break;
            dp[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            if (isPuddle[0][j]) break;
            dp[0][j] = 1;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (isPuddle[i][j]) continue;
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000007;
            }
        }
        
        return dp[n-1][m-1];
    }
}