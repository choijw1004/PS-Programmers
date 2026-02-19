import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int max = -1;
        
        for(int v : tangerine){
            max = Math.max(v,max);
        }
        
        int[] cnt = new int[max + 1];
        
        for(int v : tangerine){
            cnt[v]++;
        }
        
        Arrays.sort(cnt);
        int tmp = 0;
        int t = 0;
        
        for(int i = cnt.length -1; i >= 0; i--){
            tmp += cnt[i];
            t++;
            if(tmp >= k) break; 
        }
        
        return t;
    }
}