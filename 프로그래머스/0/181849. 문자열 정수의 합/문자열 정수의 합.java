class Solution {
    public int solution(String num_str) {
        int sum = 0;
        
        for(var c : num_str.toCharArray()) sum += c -'0';
        
        return sum;
    }
}