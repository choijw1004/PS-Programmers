import java.util.*;

class Solution {
    
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        if(n == 1){
            for(int start = 0; start <= slicer[1]; start++){
                list.add(num_list[start]);
            }
        }
        else if(n == 2){
            for(int start = slicer[0]; start < num_list.length; start++){
                list.add(num_list[start]);
            }
        }
        else if(n == 3){
            for(int start = slicer[0]; start <= slicer[1]; start++){
                list.add(num_list[start]);
            }   
        }
        else{
            for(int start = slicer[0]; start <= slicer[1]; start += slicer[2]){
                list.add(num_list[start]);
            }   
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}