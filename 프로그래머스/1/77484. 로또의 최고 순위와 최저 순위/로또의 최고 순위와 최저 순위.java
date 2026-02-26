import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        HashSet<Integer> nums = new HashSet<>();
        int[] ans = new int[2];
        int match = 6;
        int zero = 0;
        
        for(int w : win_nums){
            nums.add(w);
        }
        
        for(int l : lottos){
            if(l == 0) zero++;
            else{
                if(nums.contains(l)) match--;
            }
        }
    
        int bestRank  = Math.min(6, Math.max(1, 7 - (6 - match + zero)));
        int worstRank = Math.min(6, Math.max(1, 7 - (6 - match)));
        return new int[]{bestRank, worstRank};
        
        
    }
}