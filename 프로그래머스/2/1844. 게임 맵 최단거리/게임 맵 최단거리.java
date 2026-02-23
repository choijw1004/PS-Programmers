import java.util.*;

class Solution {
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    int n,m;
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        
        visited[0][0] = true;
        int dist = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0 ; i < size; i++){
                int[] curr = q.poll();
                
                if(curr[0] == n-1 && curr[1] == m-1) return dist;
                for(int d = 0; d < 4; d++){
                    int nx = curr[0] + dx[d];
                    int ny = curr[1] + dy[d];
                    
                    if(nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && maps[nx][ny] != 0){
                        visited[nx][ny] = true;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
            dist++;
        }
        
        return -1;
    }
}