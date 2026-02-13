class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        
        for(int start = i; start <= j; start++){
            for(char c : Integer.toString(start).toCharArray()){
                if(c - '0' == k) cnt++;
            }
        }
        
        return cnt;
    }
}