class Solution {
    public double solution(int[] arr) {
        double ans = 0;
        
        for(var v : arr){
            ans += v;
        }
        
        return ans / arr.length;
    }
}