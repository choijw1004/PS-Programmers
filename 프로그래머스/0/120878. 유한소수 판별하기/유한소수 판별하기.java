import java.util.*;

class Solution {
    private int getGCD(int a, int b){
        if(b == 0) return a;
        
        return getGCD(b, a % b);
    }
    
    public int solution(int a, int b) {
        int gcd = getGCD(a,b);
        
        a /= gcd;
        b /= gcd;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 2; i<= b; i++){
            while(b % i ==0){
                set.add(i);
                b /= i;
            }
        
        }
        
        List<Integer> list = new ArrayList<>(set);
        
        for(int i = 0 ; i < list.size(); i++){
            int n = list.get(i);
            
            if(!(n == 2 || n == 5)) return 2;
        }
        return 1;
    }
}