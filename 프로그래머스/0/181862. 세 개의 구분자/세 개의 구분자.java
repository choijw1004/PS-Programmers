import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(var c : myStr.toCharArray()){
            if(c == 'a' || c == 'b' || c == 'c'){
                if(sb.length() > 0){
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
            
            else sb.append(c);
        }
        
        if(sb.length() > 0) list.add(sb.toString());
        
        String[] ans = new String[list.size()];
        if(list.size() == 0) return new String[]{"EMPTY"};
        for(int i = 0 ; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}