import java.util.*;

class Solution {
    private int cal(int n){
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 1; i * i<= n; i++){
            if(n % i == 0) {
                set.add(i);
                if(i != n / i) set.add(n / i);
            }
        }
        return set.size();
    }
    public int solution(int number, int limit, int power) {
        int ans = 0;
        
        for(int i = 1; i <= number; i++){
            int cnt = cal(i);
            if(cnt > limit) ans += power;
            else ans += cnt;
        }
        
        return ans;
    }
}