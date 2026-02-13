class Solution {
    public int[] solution(int[] emergency) {
        int[] ans = new int[emergency.length];
        
        for(int i = 0 ; i < emergency.length; i++){
            int cnt = 1;
            for(int j = 0; j < emergency.length; j++){
                if(i == j) continue;
                
                if(emergency[i] < emergency[j]) cnt++;
            }
            ans[i] = cnt;
        }
        
        return ans;
    }
}