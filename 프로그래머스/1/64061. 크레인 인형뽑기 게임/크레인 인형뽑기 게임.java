import java.util.*;

class Solution {
    int[][] map;
    
    public int solution(int[][] board, int[] moves) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        this.map = board;
        int n = board.length;
        int ans = 0;
        
        for(var m : moves){
            
            //find top
            for(int i = 0 ; i < n; i++){
                int val = board[i][m-1];
                if(val != 0){
                    
                    if(!stack.isEmpty() && stack.peek() == val) {
                        stack.pop();
                        ans += 2;
                    }
                    else {
                        stack.push(val);
                    }
                    
                    board[i][m-1] = 0;
                    break;
                }
            }
        }
        return ans;
    }
}