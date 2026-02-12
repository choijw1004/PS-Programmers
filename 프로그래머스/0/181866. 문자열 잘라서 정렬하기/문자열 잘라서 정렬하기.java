import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        
        List<String> list = new ArrayList<>();
        
        for(var v : arr){
            if(!v.isEmpty()) list.add(v);
        }
        Collections.sort(list);
        return list.stream().toArray(String[] :: new);
    }
}