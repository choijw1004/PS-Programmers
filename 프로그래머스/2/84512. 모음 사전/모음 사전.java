import java.util.*;

class Solution {
    String[] vowels = {"A", "E", "I", "O", "U"};
    List<String> list = new ArrayList<>();
    
    private void dfs(String curr) {
        if (!curr.isEmpty()) list.add(curr);
        if (curr.length() == 5) return;
        
        for (String v : vowels) {
            dfs(curr + v);
        }
    }
    
    public int solution(String word) {
        dfs("");
        return list.indexOf(word) + 1;
    }
}