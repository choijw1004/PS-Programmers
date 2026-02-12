import java.util.*;

class Solution {
    public int solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0) set.add(i);
        }
        
        List<Integer> list = new ArrayList<>(set);
        
        return list.stream().mapToInt(i -> i).sum();
    }
}