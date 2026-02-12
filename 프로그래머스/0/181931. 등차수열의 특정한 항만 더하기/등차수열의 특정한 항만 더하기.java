class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int start = a;
        
        for(var v : included){
            if(v) sum += start;
            
            start += d;
        }
        
        return sum;
    }
}