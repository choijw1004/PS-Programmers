import java.util.*;

class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char)('A' + i)), i + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        int idx = 27; 
        
        for (char c : msg.toCharArray()) {
            sb.append(c);
            
            if (!map.containsKey(sb.toString())) {
                String prev = sb.substring(0, sb.length() - 1);
                
                list.add(map.get(prev));
                
                map.put(sb.toString(), idx++);
                
                sb = new StringBuilder();
                sb.append(c);
            }
        }
        
        if (sb.length() > 0) {
            list.add(map.get(sb.toString()));
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}