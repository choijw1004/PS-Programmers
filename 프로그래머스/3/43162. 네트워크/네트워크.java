import java.util.*;

class Solution {
    boolean[] visited;
    List<Integer>[] graph;
    
    private void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            
            for(int next : graph[curr]){
                if(!visited[next]){
                    q.add(next);
                    visited[next] = true;
                }
            }
        }
    }
    public int solution(int n, int[][] computers) {
        graph = new ArrayList[n];
        
        for(int i = 0 ; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j && computers[i][j] == 1){
                    graph[i].add(j);
                }
            }
        }
        
        visited = new boolean[n];
        int cnt = 0;
        
        for(int i = 0 ; i < n; i++){
            if(!visited[i]){
                cnt++;
                bfs(i);
            }
        }
        
        return cnt;
        
    }
}