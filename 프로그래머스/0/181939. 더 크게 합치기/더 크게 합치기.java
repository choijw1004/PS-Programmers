import java.util.*;

class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(Integer.toString(a)).append(Integer.toString(b));
        int v1 = Integer.parseInt(sb.toString());
        sb.setLength(0);
        
        sb.append(Integer.toString(b)).append(Integer.toString(a));
        int v2 = Integer.parseInt(sb.toString());
        return v1 == v2 ? v1 : Math.max(v1,v2);
        
    }
}