import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 1; i * i <= Math.pow(n,2); i++){
            if(n % i == 0) set.add(i);
        }
        
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
        
    }
}