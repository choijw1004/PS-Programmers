import java.util.*;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int cnt = 0;
        
        Arrays.sort(stations);
        
        int cover = 2 * w + 1;
        cnt += (stations[0] - w + cover - 2) / cover;
        
        
        int currEnd = stations[0] + w;
        
        for(int i = 1; i < stations.length; i++){
            int gap = stations[i] - w - 1 - currEnd;
            if(gap > 0){
                cnt += (gap + cover - 1) / cover;
            }
            currEnd = stations[i] + w;
        }
        
        if(currEnd < n){
            
            cnt += (n - currEnd + cover - 1) / cover;
        }
        
        return cnt;
    }
}