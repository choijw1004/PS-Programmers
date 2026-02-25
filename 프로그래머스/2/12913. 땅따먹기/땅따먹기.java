class Solution {
    int solution(int[][] land) {
        int n = land.length;
        int m = land[0].length;
        int[][] dp = new int[n][m];
        
        for(int i = 0 ; i < 4; i++){
            dp[0][i] = land[0][i];
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < 4; j++){
                if(j == 0){
                    dp[i][j] = land[i][j] + Math.max(dp[i-1][j+1],Math.max(dp[i-1][j+2],dp[i-1][j+3]));
                }
                else if(j == 3){
                    dp[i][j] = land[i][j] + Math.max(dp[i-1][j-1],Math.max(dp[i-1][j-2],dp[i-1][j-3]));
                }
                else if(j == 2){
                    dp[i][j] = land[i][j] + Math.max(dp[i-1][j-2],Math.max(dp[i-1][j-1],dp[i-1][j+1]));
                }
                else{
                    dp[i][j] = land[i][j] + Math.max(dp[i-1][j-1],Math.max(dp[i-1][j+1],dp[i-1][j+2]));
                }
            }
        }
        int ans = 0;
        
        for(int i = 0 ; i < 4; i++){
            ans = Math.max(dp[n-1][i], ans);    
        }
        return ans;
    }
}