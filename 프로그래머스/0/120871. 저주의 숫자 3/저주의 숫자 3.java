class Solution {
    private boolean isValid(int n){
        if(n % 3 == 0) return false;
        
        String s = Integer.toString(n);
        
        for(var c : s.toCharArray()){
            if(c == '3') return false;
        }
        return true;
    }
    public int solution(int n) {
        int start = 1;
        int cnt = 0;
        
        while(cnt < n ){
            if(isValid(start)){
                start++;
                cnt++;
            }
            else{
                start++;
            }
        }
        
        return start - 1;
    }
}