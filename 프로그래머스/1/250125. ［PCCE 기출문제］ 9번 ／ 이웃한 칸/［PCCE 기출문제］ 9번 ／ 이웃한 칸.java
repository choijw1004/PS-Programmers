class Solution {
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int m = board[0].length;
        int cnt = 0;
        String c = board[h][w];
        
        for(int i = 0 ; i < 4; i++){
            int nx = h + dx[i];
            int ny = w + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                if(board[nx][ny].equals(c)) cnt++;
            }
        }
        return cnt;
    }
}