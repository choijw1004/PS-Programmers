import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(var a : arr){
            boolean d = false;
            for (var b : delete_list){
                if(a == b) d = true;
            }
            
            if(d == false) list.add(a); 
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}