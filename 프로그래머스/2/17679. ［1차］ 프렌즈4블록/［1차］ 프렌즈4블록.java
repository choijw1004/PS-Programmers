class Solution {
    char[][] map;
    public int solution(int m, int n, String[] board) {
        map = new char[m][n];
        int answer = 0;
        
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                map[i][j] = board[i].charAt(j);
        
        while(true){
            boolean[][] toDelete = new boolean[m][n];
            
            for(int i = 0; i < m-1; i++)
                for(int j = 0; j < n-1; j++)
                    if(map[i][j] != ' ' 
                       && map[i][j] == map[i][j+1] 
                       && map[i][j] == map[i+1][j] 
                       && map[i][j] == map[i+1][j+1])
                        toDelete[i][j] = toDelete[i][j+1] 
                        = toDelete[i+1][j] = toDelete[i+1][j+1] = true;
            
            int cnt = 0;
            for(int i = 0; i < m; i++)
                for(int j = 0; j < n; j++)
                    if(toDelete[i][j]){ map[i][j] = ' '; cnt++; }
            
            if(cnt == 0) break;
            answer += cnt;
            
            for(int j = 0; j < n; j++){
                int k = m-1;
                for(int i = m-1; i >= 0; i--)
                    if(map[i][j] != ' '){
                        map[k][j] = map[i][j];
                        if(k != i) map[i][j] = ' ';
                        k--;
                    }
            }
        }
        return answer;
    }
}