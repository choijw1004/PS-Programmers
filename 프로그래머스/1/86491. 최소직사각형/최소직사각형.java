class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for(int[] size : sizes){
            int n  = Math.max(size[0],size[1]);
            int m = Math.min(size[1],size[0]);
            
            maxW = Math.max(n,maxW);
            maxH = Math.max(m,maxH);
        }
        return maxW*maxH;
        
    }
}