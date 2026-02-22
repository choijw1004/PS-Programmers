class Solution {
    int n,k,ans;
    boolean[] visited;
    int[][] dungeons;
    private void dfs(int piro, int cnt){
        ans = Math.max(cnt, ans);
        
        for(int i = 0 ; i < n; i++){
            if(piro >= dungeons[i][0] && !visited[i]){
                visited[i] = true;
                dfs(piro - dungeons[i][1], cnt + 1);
                visited[i] = false;
            }
        }
    }
    public int solution(int k, int[][] dungeons) {
        this.n = dungeons.length;
        this.k = k;
        this.ans = -1;
        this.visited = new boolean[n];
        this.dungeons = dungeons;
        
        //현재 피로도, 카운트 
        dfs(k, 0);
        
        return ans;
    }
}