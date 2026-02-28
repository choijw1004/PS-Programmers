import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        
        for(int[] d : data){
            if(d[map.get(ext)] < val_ext){
                list.add(d);
            }
        }
        Collections.sort(list, (a,b) -> a[map.get(sort_by)] - b[map.get(sort_by)]);
        int[][] ans = new int[list.size()][4];
        
        for(int i = 0 ; i < list.size(); i++){
            for(int j = 0; j < 4; j++){
                ans[i][j] = list.get(i)[j];
            }
        }
        
        return ans;
    }
}