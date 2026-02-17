import java.util.*;
 
class Node{
    int num;
    int dist;
    
    public Node(int num, int dist){
        this.num = num;
        this.dist = dist;
    }
}

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Node> list = new ArrayList<>();
        
        for(var num : numlist){
            list.add(new Node(num, Math.abs(n - num)));    
        }
        
        Collections.sort(list, (a,b) ->{
            if(a.dist != b.dist){
                return Integer.compare(a.dist, b.dist);
            }
            else return Integer.compare(b.num, a.num);
        });
        
        int[] ans = new int[list.size()];
        
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = list.get(i).num;
        }
        
        return ans;
    }
}