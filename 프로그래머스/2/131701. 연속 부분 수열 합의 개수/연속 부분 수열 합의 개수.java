import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int n = elements.length;
        
        for(int size = 1; size <= n; size++){
            int sum = 0;
            
            for(int i = 0 ; i <size; i++){
                sum += elements[i];
            }
            set.add(sum);
            
            for(int start = 1; start < n; start++){
                sum += elements[(start + size - 1) % n] - elements[start - 1];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}