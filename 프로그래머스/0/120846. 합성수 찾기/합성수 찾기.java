import java.util.*;

class Solution {
    public int solution(int n) {
        int cnt = 0;
        
        for(int i = 1; i <= n; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = 1; j <= i; j++){
                if(i % j == 0) set.add(j);
                
                if(i % (i / j) == 0) set.add(i / j);
            }
            
            if(set.size() >= 3) cnt++;
        }
        
        return cnt;
    }
}