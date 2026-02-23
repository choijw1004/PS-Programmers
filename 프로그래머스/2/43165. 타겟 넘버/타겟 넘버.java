class Solution {
    int target;
    int[] numbers;
    int cnt;
    private void dfs(int idx, int curr){
        if(idx == numbers.length){
            if(curr == target){
                cnt++;
            }
            return;
        }
        dfs(idx + 1, curr + numbers[idx]);
        dfs(idx + 1, curr - numbers[idx]);
    }
    public int solution(int[] numbers, int target) {
        this.target = target;
        this.numbers = numbers;
        this.cnt = 0;
        
        dfs(0,0);
        
        return cnt;
    }
}