import java.util.*;

class Solution {
    public long solution(String numbers) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three",3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six",6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        
        for(var c : numbers.toCharArray()){
            sb.append(c);
            
            if(map.containsKey(sb.toString())){
                ans.append(Integer.toString(map.get(sb.toString())));
                sb.setLength(0);
            }
        }
        
        return Long.parseLong(ans.toString());
    }
}