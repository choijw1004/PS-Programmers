class Solution {
    public int solution(int[] array, int height) {
        int cnt = 0;
        
        for(int n : array){
            if (n > height) cnt++;
        }
        return cnt;
    }
}