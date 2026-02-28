class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] d = new int[n+2];
        
        for(var i : lost) d[i]--;
        for(var i : reserve) d[i]++;
        
        for(int i = 1; i <= n; i++){
            if(d[i] == -1){
                if(d[i-1] >=1){
                    d[i-1]--;
                    d[i]++;
                }
                else if(d[i+1] >=1){
                    d[i+1]--;
                    d[i]++;
                }
            }
        }
        int cnt = 0;
        
        for(int i = 1; i <= n; i++){
            if(d[i] >= 0) cnt++;
        }
        return cnt;
    }
}