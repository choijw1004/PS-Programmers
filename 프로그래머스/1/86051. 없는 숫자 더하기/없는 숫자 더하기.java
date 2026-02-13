class Solution {
    public int solution(int[] numbers) {
        int[] cnt = new int[10];
        
        for(var v : numbers){
            cnt[v]++;
        }
        int sum = 0;
        
        for(int i = 0 ; i < cnt.length; i++){
            if(cnt[i] == 0) sum += i;
        }
        
        return sum;
    }
}