import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(var v : strArr){
            if(!v.contains("ad")) list.add(v);
        }
        
        return list.stream().toArray(String[]::new);
    }
}