import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        
        for(int n : arr) {
            min = Math.min(n,min);
            list.add(n);
        }
        
        list.remove(Integer.valueOf(min));
        
        return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(i -> i).toArray();
    }
}