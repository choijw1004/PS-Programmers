class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        for(var v : Integer.toString(x).toCharArray()){
            sum += v -'0';
        }
        
        return x % sum == 0 ? true : false;
    }
}