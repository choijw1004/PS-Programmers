class Solution {
    public int solution(int[] array, int n) {
        int cnt = 0;
        
        for(var a : array){
            if(a == n) cnt++;
        }
        return cnt;
    }
}