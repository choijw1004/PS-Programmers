class Solution {
    public int solution(int[] array) {
        int cnt = 0;
        
        for(var v : array){
            for(var c : Integer.toString(v).toCharArray()){
                if(c == '7') cnt++;
            }
        }
        
        return cnt;
    }
}