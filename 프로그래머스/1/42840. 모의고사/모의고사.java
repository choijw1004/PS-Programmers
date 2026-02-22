import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {2,1,2,3,2,4,2,5};
        int[] n3 = {3,3,1,1,2,2,4,4,5,5};
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,0);
        map.put(2,0);
        map.put(3,0);
        
        for(int i = 0 ; i < answers.length; i++){
            int s1 = answers[i];
            int n1s = n1[i % 5];
            int n2s = n2[i % 8];
            int n3s = n3[i % 10];
            
            if(s1 == n1s) map.put(1,map.getOrDefault(1,0) + 1);
            if(s1 == n2s) map.put(2,map.getOrDefault(2,0) + 1);
            if(s1 == n3s) map.put(3,map.getOrDefault(3,0) + 1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        List<Integer> ans = new ArrayList<>();
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());
        
        int max = list.get(0).getValue();
        ans.add(list.get(0).getKey());
        for(int i = 1; i < 3; i++){
            if(list.get(i).getValue() == max) ans.add(list.get(i).getKey());
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
        
    }
}