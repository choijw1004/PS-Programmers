import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(var v : arr){
            if(v % divisor  == 0) list.add(v);
        }
        Collections.sort(list);
        if(list.size() == 0) return new int[]{-1};
        else return list.stream().mapToInt(i -> i).toArray();
    }
}