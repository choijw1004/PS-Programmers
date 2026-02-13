import java.util.*;

class Solution {
    private int getDivisor(int a){
        Set<Integer> set = new HashSet<>();
        
        for(int i = 1; i * i <= a; i++){
            if(a % i == 0) set.add(i);
            
            if(a % (a / i) == 0) set.add(a/i); 
        }
        
        return set.size();
    }
    public int solution(int left, int right) {
        int sum = 0;
        
        for(int i = left; i <= right; i++){
            if(getDivisor(i) % 2 == 0) sum += i;
            else sum -= i;
        }
        
        return sum;
    }
}