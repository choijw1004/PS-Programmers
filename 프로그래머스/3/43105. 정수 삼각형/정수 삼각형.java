class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n][n];
        
        //triangle
        dp[0][0] = triangle[0][0];
        
        dp[1][0] = triangle[0][0] + triangle[1][0];
        dp[1][1] = triangle[0][0] + triangle[1][1];
        
        for(int i = 2; i < n; i++){
            for(int j = 0; j < triangle[i].length; j++){
                // 왼쪽
                if(j == 0){
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                }
                
                // 오른쪽
                else if(j == triangle[i].length -1){
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                }
                
                // 중간
                else{
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
                }
            }
        }
        
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            ans = Math.max(dp[n-1][i], ans);
        }
        
        return ans;
    }
}