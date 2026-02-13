class Solution {
    public int solution(int num) {
        long n = num;
        int cnt = 0;
        if(num == 1)return 0;
        
        while(cnt < 500){
            if(n % 2 == 0) n /= 2;
            else n = (n*3) + 1;
            
            cnt++;
            if(n == 1) return cnt;
        }
        return -1;
    }
}