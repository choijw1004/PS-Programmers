class Solution {
    public int[][] solution(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        if(r > c){
            int[][] tmp = new int[r][r];
            
            for(int i = 0 ; i < r; i++){
                for(int j = 0; j < c; j++){
                    if(j >= c) tmp[i][j] = 0;
                    else tmp[i][j] = arr[i][j];    
                }
            }
            return tmp;
        }
        else if (r < c){
            int[][] tmp = new int[c][c];
            
            for(int i = 0 ; i < r; i++){
                for(int j = 0; j < c; j++){
                    if(i >= r) tmp[i][j] = 0;
                    else tmp[i][j] = arr[i][j];    
                }
            }
            return tmp;
        }
        else return arr;
    }
}