import java.util.*;

class Solution {
    char[] nums;
    int n;
    boolean[] visited;
    Set<Integer> set;
    private boolean isPrime(int n){
        if(n < 2) return false;
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    private void dfs(int cnt, StringBuilder curr){
        if(cnt >= 1){
            int num = Integer.parseInt(curr.toString());
            if(isPrime(num)) set.add(num);
        }
        
        if(cnt == n) return;
        
        for(int i = 0 ; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                curr.append(nums[i]);
                dfs(cnt + 1, curr);
                visited[i] = false;
                curr.deleteCharAt(curr.length() - 1);
            }
        }
    }
    public int solution(String numbers) {
        nums = numbers.toCharArray();
        n = numbers.length();
        set = new HashSet<>();
        visited = new boolean[n];
        StringBuilder sb = new StringBuilder();
        dfs(0, sb);
        System.out.println(set);
        return set.size();
    }
}