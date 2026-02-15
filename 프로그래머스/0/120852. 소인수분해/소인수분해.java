import java.util.*;

class Solution {
    
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 2; i<= n; i++){
            
            while(n % i == 0){
                set.add(i);
                n /= i;
            }
        }
        
        int[] ans = new int[set.size()];
        List<Integer> tmp = new ArrayList<>(set);
        Collections.sort(tmp);
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = tmp.get(i);
        }
        
        return ans;
    }
}