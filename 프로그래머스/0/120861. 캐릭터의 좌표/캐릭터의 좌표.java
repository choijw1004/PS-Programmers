class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] ans = {0,0};
        int minX = (board[0] / 2) * -1;
        int maxX = board[0] / 2;
        int minY = (board[1] / 2) * -1;
        int maxY = board[1] / 2;
        
        for(var op : keyinput){
            if(op.equals("up")){
                ans[1]++;
                
                if(ans[1] > maxY) ans[1] = maxY;
            }
            else if(op.equals("down")){
                ans[1]--;
                if(ans[1] < minY) ans[1] = minY;
            }
            else if(op.equals("left")){
                ans[0]--;
                if(ans[0] < minX) ans[0] = minX;
            }
            else{
                ans[0]++;
                if(ans[0] > maxX) ans[0] = maxX;
            }
        }
        return ans;
    }
}