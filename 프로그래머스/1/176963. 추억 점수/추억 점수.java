import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        
        //name
        //yearning
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        int[] ans = new int[photo.length];
        
        for(int i = 0 ; i < photo.length; i++){
            int sum = 0;
            
            for(int j = 0 ; j < photo[i].length; j++){
                sum += map.getOrDefault(photo[i][j],0);
            }
            ans[i] = sum;
        }
        return ans;
    }
}
