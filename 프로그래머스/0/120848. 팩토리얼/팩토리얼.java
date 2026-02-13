class Solution {
    public int solution(int n) {
        int start = 1;
        int mul = 1;
        
        while(mul * (start + 1)<= n){
            start++;
            mul *= start;
        
        }
        
        return start;
    }
}