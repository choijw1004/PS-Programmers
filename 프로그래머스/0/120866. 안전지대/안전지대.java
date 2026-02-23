import java.util.*;

class Solution {
    int[] dx = {-1,-1,-1,0,0,1,1,1};
    int[] dy = {-1,0,1,1,-1,1,0,-1};
    public int solution(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        List<int[]> list = new ArrayList<>();
        
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m; j++){
                
                if(board[i][j] == 1){
                    
                    list.add(new int[]{i,j});
                }
            }
        }
        
        for(int i = 0;  i < list.size(); i++){
            int cx = list.get(i)[0];
            int cy = list.get(i)[1];
            
            for(int d= 0 ; d < 8; d++){
                int nx = cx + dx[d];
                int ny = cy + dy[d];

                if(nx >= 0 && ny >= 0 && nx < n && ny < m && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                }
            }
        }
        
        int cnt = 0 ;
        
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m; j++){
                if(board[i][j] == 0)cnt++; 
            }
        }
        return cnt;
    }
}