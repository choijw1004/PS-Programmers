import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int cnt = 0;
        for(var skill_tree : skill_trees){
            boolean can = true;
            List<Integer> list = new ArrayList<>();
            
            for(var c : skill.toCharArray()){
                int idx = skill_tree.indexOf(c);
                list.add(idx);
            }
            
            // 스킬이 없는 경우를 어떻게 처리할 것인가? 
            for(int i = 0; i < list.size() -1; i++){
                if(list.get(i) == -1){
                    for(int j = i + 1; j < list.size(); j++){
                        if(list.get(j) != -1) can = false;
                    }
                }
                if(list.get(i) != -1 && list.get(i+1) != -1 && list.get(i) > list.get(i+1)) can = false;
            }
            
            if(can) cnt++;
        }
        
        return cnt;
    }
}