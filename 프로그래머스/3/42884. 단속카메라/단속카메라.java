import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int cnt = 1;
        Arrays.sort(routes, (a,b) -> a[1] - b[1]);
        
        int currEnd = routes[0][1];
        
        for(int i = 1; i < routes.length; i++){
            if(currEnd < routes[i][0]){
                cnt++;
                currEnd = routes[i][1];
            }
        }
        
        return cnt;
    }
}