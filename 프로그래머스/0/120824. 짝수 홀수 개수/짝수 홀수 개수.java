class Solution {
    public int[] solution(int[] num_list) {
        int[] ans = new int[2];
        
        for(var n : num_list){
            if(n % 2 == 0) ans[0]++;
            else ans[1]++;
        }
        return ans;
    }
}