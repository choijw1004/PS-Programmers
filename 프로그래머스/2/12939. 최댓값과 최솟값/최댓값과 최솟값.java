import java.util.*;

class Solution {
    public String solution(String s) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(var c : s.split(" ")){
            set.add(Integer.parseInt(c));
        }
        
        return Integer.toString(set.first()) + " " + Integer.toString(set.last());
    }
}