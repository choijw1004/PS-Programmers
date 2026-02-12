class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        
        for(var v : numbers){
            sum += v;
            
            if(sum > n) return sum;
        }
        
        return 0;
    }
}