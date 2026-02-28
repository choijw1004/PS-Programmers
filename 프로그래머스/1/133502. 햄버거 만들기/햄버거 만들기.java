import java.util.*;
class Solution {
    
    public int solution(int[] ingredient) {
        int cnt = 0;
        List<Integer> stack = new ArrayList<>();
        
        for (int i : ingredient) {
            stack.add(i);
            
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size-4) == 1 &&
                    stack.get(size-3) == 2 &&
                    stack.get(size-2) == 3 &&
                    stack.get(size-1) == 1) {
                    
                    cnt++;
                    stack.remove(size-1);
                    stack.remove(size-2);
                    stack.remove(size-3);
                    stack.remove(size-4);
                }
            }
        }
        
        return cnt;
    }
}