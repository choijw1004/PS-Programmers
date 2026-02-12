import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(var a : arr){
            for(int i = 0 ; i < a; i++){
                list.add(a);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}