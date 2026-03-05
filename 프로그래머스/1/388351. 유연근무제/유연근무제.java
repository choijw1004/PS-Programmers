import java.util.*;

class Solution {
    private int tToInt(int n){
        int rt = 0;
        String tmp = Integer.toString(n);
        
        if(tmp.length() == 3){
            String h = tmp.substring(0,1);
            String m = tmp.substring(1);
            rt = (Integer.parseInt(h) * 60) + Integer.parseInt(m);
        }
        else{
            String h = tmp.substring(0,2);
            String m = tmp.substring(2);
            rt = (Integer.parseInt(h)* 60) + Integer.parseInt(m);
        }
        
        return rt;
    }
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        //schedules
        //timelogs
        //startday
        
        for(int i = 0 ; i < schedules.length; i++){
            int curr = schedules[i];
            
            schedules[i] = tToInt(curr) + 10;
        }
        int ans = 0;
        
        for(int i = 0; i < schedules.length; i++){
            int st = schedules[i];
            boolean can = true;
            
            for(int j = 0; j < 7; j++){
                int day = (startday -1 + j) % 7;
                
                if(day == 5 || day == 6) continue;
                
                if(tToInt(timelogs[i][j]) > st) can = false;
            }
            if(can) ans++;
        }
        return ans;
    }
}