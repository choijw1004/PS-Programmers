import java.util.*;

class Solution {
    List<Integer> nums;
    public int[] solution(int n, int s) {
        
        if(s < n) return new int[]{-1};
        int[] ans = new int[n];
        
        Arrays.fill(ans, s / n);
        
        int idx = 0;
        int mod = s % n;
        
        while(mod-- > 0){
            int i = idx % n;
            
            ans[i]++;
            idx++;
        }
        
        Arrays.sort(ans);
        
        return ans;
    }
}