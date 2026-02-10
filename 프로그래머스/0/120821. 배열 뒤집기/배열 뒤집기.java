class Solution {
    public int[] solution(int[] num_list) {
        int[] ans = new int[num_list.length];
        int n = num_list.length;
        
        for(int i = 0, j = n-1; i < n; i++, j--){
            ans[i] = num_list[j];
        }
        
        return ans;
    }
}