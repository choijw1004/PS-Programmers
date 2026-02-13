class Solution {
    public int solution(int[] num_list) {
        int cnt = 0;
        
        for(int v : num_list){
            while(v != 1){
                if(v % 2 ==0){
                    cnt += 1;
                    v /= 2;
                }
                else{
                    cnt += 1;
                    v -= 1;
                    v /= 2;
                }
            }
        }
        
        return cnt;
    }
}