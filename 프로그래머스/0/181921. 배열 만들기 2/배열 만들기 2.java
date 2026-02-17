import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            boolean can = true;
            for(char c : Integer.toString(i).toCharArray()){
                if(!(c == '0' || c== '5')){
                    can = false;
                    break;
                }
            }
            
            if(can == true) list.add(i);
        }
        
        if(list.size() == 0) return new int[]{-1};
        int[] ans = new int[list.size()];
        
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}