class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        int r = board.length;
        int c = board[0].length;
        
        for(int i = 0 ; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i + j <= k) sum += board[i][j];
            }
        }
        return sum;
    }
}