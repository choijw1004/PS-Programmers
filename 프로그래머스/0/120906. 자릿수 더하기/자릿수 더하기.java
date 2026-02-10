class Solution {
    public int solution(int n) {
        char[] arr = Integer.toString(n).toCharArray();
        
        int sum = 0;
        
        for(var c : arr){
            sum += c - '0';
        }
        
        return sum;
    }
}