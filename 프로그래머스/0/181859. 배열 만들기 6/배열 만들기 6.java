import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        
        while(i < arr.length){
            if(list.size() == 0){
                list.add(arr[i]);
                i++;
            }
            else if(arr[i] == list.get(list.size() - 1)){
                list.remove(list.size() - 1);
                i++;
            }
            else if(arr[i] != list.get(list.size() -1)){
                list.add(arr[i]);
                i++;
            }
        }
        return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(j -> j).toArray();
    }
}