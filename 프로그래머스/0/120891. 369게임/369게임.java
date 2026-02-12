class Solution {
    public int solution(int order) {
        int cnt = 0;
        
        for(var c: Integer.toString(order).toCharArray()){
                if(c == '3' || c == '6' || c == '9') cnt++;
        }
        return cnt;
    }
}