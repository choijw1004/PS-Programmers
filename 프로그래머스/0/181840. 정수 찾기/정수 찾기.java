import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        for(var c : num_list) if(c == n) return 1;
        
        return 0;
    }
}