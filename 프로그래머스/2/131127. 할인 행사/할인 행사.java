import java.util.*;

class Solution {
    private boolean isValid(HashMap<String,Integer> wantMap, HashMap<String, Integer> discountMap){
        for (var entry : wantMap.entrySet()) {
            if (discountMap.getOrDefault(entry.getKey(), 0) < entry.getValue()) return false;
        }
        return true;
    }
    
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String,Integer> wantMap = new HashMap<>();
        HashMap<String, Integer> discountMap = new HashMap<>();
        
        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
        }
        int start = 0;
        int end = 0;
        int ans = 0;
        
        
        while(end < discount.length){
            if(end - start + 1 < 10){
                discountMap.put(discount[end], discountMap.getOrDefault(discount[end],0) + 1);
                end++;
            }
            else{
                    discountMap.put(discount[end], discountMap.getOrDefault(discount[end],0) + 1);
    end++;
                if(isValid(wantMap, discountMap)) ans++;

                discountMap.put(discount[start], discountMap.getOrDefault(discount[start],0) - 1);
                if(discountMap.get(discount[start]) <= 0) discountMap.remove(discount[start]);
                start++;

}
        }
        
        return ans;
    }
}