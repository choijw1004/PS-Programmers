import java.util.*;

class Solution {
    List<Integer> list;
    private void rec(int n){
        if(n == 1) {
            list.add(1);
            return;
        }
        
        if(n % 2 == 0){
            list.add(n);
            rec(n/2);
        }
        
        else{
            list.add(n);
            rec(3 * n + 1);
        }
    }
    public int[] solution(int n) {
        list = new ArrayList<>();
        
        rec(n);
        return list.stream().mapToInt(i -> i).toArray();
    }
}