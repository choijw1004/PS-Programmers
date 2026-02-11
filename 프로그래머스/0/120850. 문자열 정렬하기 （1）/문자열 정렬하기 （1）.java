import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] arr = my_string.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(var c : arr){
            if(Character.isDigit(c)) list.add(c - '0');
        }
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
        
    }
}