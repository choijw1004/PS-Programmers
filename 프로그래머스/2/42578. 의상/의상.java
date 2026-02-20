import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (var c : clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }
        
        int ans = 1;
        for (var cnt : map.values()) {
            ans *= (cnt + 1);
        }
        
        return ans - 1;
    }
}