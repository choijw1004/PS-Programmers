import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        
        String[] tmp = myString.split("x",-1);
        for(var s : tmp){
            list.add(s.length());
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}