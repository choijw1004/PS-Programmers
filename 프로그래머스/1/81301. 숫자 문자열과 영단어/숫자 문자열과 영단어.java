import java.util.*;

class Solution {
    public int solution(String s) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        
        StringBuilder ans = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        
        for(char c : s.toCharArray()){
            
            //숫자인 경우
            if(Character.isDigit(c)){
                ans.append(c);
            }
            
            //숫자가 아닌 경우
            else{
                tmp.append(c);
                
                //map에 있는지 체크 
                //있는 경우
                if(map.containsKey(tmp.toString())){
                    ans.append(map.get(tmp.toString()));
                    tmp.setLength(0);
                }
            }
        }
        return Integer.parseInt(ans.toString());
    }
}