import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int left = 0;
        int right = people.length - 1;
        int cnt = 0;
        Arrays.sort(people);
        
        while(left <= right){
            int tmp = people[left] + people[right];
            
            if(tmp > limit){
                cnt ++;
                right--;
            }
            
            else{
                cnt++;
                right--;
                left++;
            }
        }
        
        
        return cnt;
    }
}