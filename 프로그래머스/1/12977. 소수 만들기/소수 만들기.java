import java.util.*;

class Solution {
    int[] nums;
    int cnt;
    private boolean isPrime(int n){
        if(n < 2) return false;
        
        for(int i = 2; i * i <=n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    private void dfs(int idx , List<Integer> list){
        if(list.size() == 3){
            int sum = 0;
            for(int i = 0 ; i < 3; i++){
                sum += list.get(i);
            }
            if(isPrime(sum)) cnt++;
            return;
        }
        
        for(int i = idx; i < nums.length; i++){
            list.add(nums[i]);
            dfs(i + 1, list);
            list.remove(list.size() - 1);
        }
    }
    public int solution(int[] nums) {
        this.nums = nums;
        this.cnt = cnt;
        List<Integer> list = new ArrayList<>();
        
        dfs(0, list);
        
        return cnt;
    }
}