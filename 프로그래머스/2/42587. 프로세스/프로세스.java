import java.util.*;
class Process{
    int idx;
    int pri;
    
    public Process(int idx, int pri){
        this.idx = idx;
        this.pri = pri;
    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> q = new LinkedList<>();
        int cnt = 0;
        
        for(int i = 0 ; i < priorities.length; i++){
            q.add(new Process(i, priorities[i]));        
        }
        
        while(!q.isEmpty()){
            Process curr = q.poll();
            boolean isHigher = false;
            
            for(var pro : q){
                if(pro.pri > curr.pri){
                    isHigher = true;
                    break;
                }
            }
            
            if(isHigher){
                q.add(curr);
            }
            else{
                cnt++;
                if(curr.idx == location) return cnt;
            }
        }
        
        return -1;
    }
}