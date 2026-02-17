class Solution {
    public int[] solution(int[][] score) {
        int[] ans = new int[score.length];
        double[] tmp = new double[score.length];
        
        int n = score.length;
        
        for(int i = 0 ; i < score.length; i++){
            double avg = (score[i][0] + score[i][1]) / 2.0;
            tmp[i] = avg;
        }
        
        for(int i = 0 ; i < n; i++){
            int cnt = 1;
            
            for(int j = 0 ; j < n; j++){
                if(i == j) continue;
                
                if(tmp[i] < tmp[j]) cnt++;
            }
            
            ans[i] = cnt;
        }
        
        return ans;
    }
}