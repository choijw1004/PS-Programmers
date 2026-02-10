import java.util.*;

class Solution {
    public int solution(int n, int t) {
        int ans = n;
        
        for(int i = 1; i <= t; i++){
            ans = ans * 2;
        }
        
        return ans;
    }
}