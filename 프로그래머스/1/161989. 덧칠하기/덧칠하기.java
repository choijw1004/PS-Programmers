import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        Arrays.sort(section);
        
        int currCover = section[0] + m - 1;
        int cnt = 1;
        
        for(int i = 1; i < section.length; i++){
            if(section[i] > currCover){
                cnt++;
                currCover = section[i] + m - 1;
            }
        }
        return cnt;
    }
}