class Solution {
    public int[][] solution(int[] num_list, int n) {
        int r = num_list.length /n;
        int c = n;
        
        int[][] ans = new int[r][c];
        
        for(int i = 0 ; i < num_list.length; i++){
            int num = num_list[i];
            
            int x = i / c;
            int y = i % c;
            
            ans[x][y] = num;
        }
        return ans;
    }
}