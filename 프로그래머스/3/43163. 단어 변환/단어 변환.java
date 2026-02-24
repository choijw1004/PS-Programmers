import java.util.*;

class Solution {
    private boolean find(String a, String b){
        int cnt = 0;
        
        for(int i = 0 ; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)) cnt++;
        }
        
        return cnt == 1;
    }
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<String> q = new LinkedList<>();
        
        q.add(begin);
        int time = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0 ; i < size; i++){
                String curr = q.poll();
                if(curr.equals(target)) return time;
                
                for(int j = 0; j < words.length; j++){
                    if(find(words[j], curr) && !visited[j]){
                        q.add(words[j]);
                        visited[j] = true;
                    }
                }
            }
            time++;
        }
        return 0;
    }
}