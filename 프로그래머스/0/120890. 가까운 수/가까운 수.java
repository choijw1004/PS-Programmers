class Solution {
    public int solution(int[] array, int n) {
        int diff = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < array.length ;i++){
            int num = array[i];
            
            if(Math.abs(num - n) < diff){
                diff = Math.min(diff,Math.abs(num - n));
                ans = num;
            }
            
            else if(Math.abs(num - n) == diff){
                ans = Math.min(ans, num);
            }
        }
        
        return ans;
    }
}