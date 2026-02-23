import java.util.*;

class Solution {
    public int[] solution(String s) {
        String tmp = s.substring(2, s.length() - 2);
        
        String[] nset = tmp.split("\\},\\{");
        
        List<List<Integer>>list = new ArrayList<>();
        
        for(int i = 0 ; i < nset.length; i++){
            String[] nums = nset[i].split(",");
            List<Integer> arr = new ArrayList<>();
            for(var num : nums){
                arr.add(Integer.parseInt(num));
            }
            list.add(arr);
        }
        
        Collections.sort(list, (a,b) -> a.size() - b.size());
        
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                if(!set.contains(list.get(i).get(j))){
                    set.add(list.get(i).get(j));
                    ans.add(list.get(i).get(j));
                }
            }
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}