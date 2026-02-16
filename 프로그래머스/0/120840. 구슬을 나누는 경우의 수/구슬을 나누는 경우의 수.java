class Solution {
    public int solution(int balls, int share) {
        double ans = 1;
        
        for(int i = 1; i <= share; i++){
            ans = ans * (balls - i + 1) / i;
        }
        
        return (int)ans;
    }
}