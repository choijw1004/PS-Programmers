import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int cnt = 1;
        Arrays.sort(targets, (a,b) -> a[0] - b[0]);
        int n = targets.length;
        int currEnd = targets[0][1];
        
        for(int i = 1; i < n; i++){
            int nextStart = targets[i][0];
            int nextEnd = targets[i][1];
            
            if(currEnd <= nextStart){
                cnt++;
                currEnd = nextEnd;
            }
            
            else{
                currEnd = Math.min(currEnd, nextEnd);
            }
        }
        
        return cnt;
    }
}