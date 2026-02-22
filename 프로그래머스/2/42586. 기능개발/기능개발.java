import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] day = new int[n];
        
        for(int i = 0 ; i < n; i++){
            day[i] = ((100 - progresses[i]) + speeds[i] - 1) / speeds[i];
        }
        
        List<Integer> result = new ArrayList<>();
        int pre = day[0];
        int cnt = 1;
        
        for(int i = 1; i < n; i++){
            int currDay = day[i];
            
            if(currDay <= pre){
                cnt++;
            }
            
            else{
                result.add(cnt);
                cnt = 1;
                pre = day[i];
            }
        }
        
        result.add(cnt);
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}