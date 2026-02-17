class Solution {
    private int count(int n){
        int cnt = 0;
        for(var c : Integer.toString(n,2).toCharArray()){
            if(c == '1') cnt++;
        }
        return cnt;
    }
    public int solution(int n) {
        int next = n + 1;
        while(true){
            if(count(next) == count(n)) return next;
            
            next++;
        }
    }
}