import java.util.*;

class Solution {
    List<List<String>> list;
    String[][] tickets;
    boolean[] visited;
    int n;
    
    private void dfs(String start, int cnt, List<String> tmp){
        if(cnt == n){
            list.add(new ArrayList<>(tmp));
        }
        
        for(int i = 0 ; i < n; i++){
            if(tickets[i][0].equals(start) && !visited[i]){
                visited[i] = true;
                tmp.add(tickets[i][1]);
                int newC = cnt + 1;
                dfs(tickets[i][1], newC, tmp);
                visited[i] = false;
                tmp.remove(tmp.size() - 1);
            }
        }
    }
    public String[] solution(String[][] tickets) {
        n = tickets.length;
        list = new ArrayList<>();
        visited = new boolean[n];
        this.tickets = tickets;
        List<String> t = new ArrayList<>();
        t.add("ICN");
        dfs("ICN", 0, t);
        
        Collections.sort(list, (a, b) -> {
        for (int i = 0; i < a.size(); i++) {
                int cmp = a.get(i).compareTo(b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });
        return list.get(0).toArray(new String[0]);
    }
}