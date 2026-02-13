class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        
        
        for(int i = 0 ; i < signs.length; i++){
            int n = absolutes[i];
            
            if(signs[i]) sum += n;
            else sum -= n;
        }
        return sum;
    }
}