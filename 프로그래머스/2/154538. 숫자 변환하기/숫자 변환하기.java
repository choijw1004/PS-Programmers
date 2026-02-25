import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;
        q.add(x);
        boolean[] visited = new boolean[10000001];
        visited[x] = true;
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0 ; i < size; i++){
                int curr = q.poll();
                if(curr == y) return cnt;
                
                int n1 = curr + n;
                int n2 = curr * 2;
                int n3 = curr * 3;
                
                if(n1 >= 1 && n1 <= 1000000 && !visited[n1]) {
                    q.add(n1);
                    visited[n1] = true;
                }
                if(n2 >= 1 && n2 <= 1000000&& !visited[n2]) {
                    q.add(n2);
                    visited[n2] = true;
                }
                if(n3 >= 1 && n3 <= 1000000&& !visited[n3]) {
                    q.add(n3);
                    visited[n3] = true;
                }
            }
            cnt++;
        }
        return -1;
    }
}