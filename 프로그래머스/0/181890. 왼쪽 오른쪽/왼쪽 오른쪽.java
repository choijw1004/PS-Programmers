import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<Integer> list = new ArrayList<>();
        
        int lIdx = -1;
        int rIdx = -1;

        for(int i = 0 ; i < str_list.length; i++){
            if(str_list[i].equals("l")) {
                lIdx = i;
                break;
            }
            else if(str_list[i].equals("r")) {
                rIdx = i;
                break;
            }
        }
        
        if(lIdx == -1 && rIdx == -1) return new String[]{};
        
        if(lIdx != -1) return Arrays.copyOfRange(str_list,0,lIdx);
        
        if(rIdx != -1) return Arrays.copyOfRange(str_list,rIdx+1,str_list.length);
        
        return new String[]{};
    }
}