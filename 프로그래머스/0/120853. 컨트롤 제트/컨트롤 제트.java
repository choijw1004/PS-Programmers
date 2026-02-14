import java.util.*;

class Solution {
    public int solution(String s) {
        int sum = 0;
        int last = 0;
        
        String[] arr = s.split(" ");
        
        for(var st : arr){
            if(st.equals("Z")){
                sum -= last;
            }
            
            else{
                last = Integer.parseInt(st);
                sum += last;
            }
        }
        
        return sum;
    }
}