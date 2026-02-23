import java.util.*;

class Solution {
    private List<String> makeList(String str){
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < str.length() - 1; i++){
            StringBuilder sb = new StringBuilder();
            
            char p = str.charAt(i);
            char n = str.charAt(i + 1);
            
            if(!Character.isAlphabetic(p) || !Character.isAlphabetic(n)) continue;
            sb.append(p);
            sb.append(n);
            
            list.add(sb.toString().toLowerCase());
        }
        return list;
    }
    public int solution(String str1, String str2) {
        List<String> list1 = makeList(str1);
        List<String> list2 = makeList(str2);

        // 둘 다 비어있으면 유사도 1
        if (list1.isEmpty() && list2.isEmpty()) return 65536;

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : list1) map1.put(s, map1.getOrDefault(s, 0) + 1);
        for (String s : list2) map2.put(s, map2.getOrDefault(s, 0) + 1);

        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        int low = 0, high = 0;
        for (String key : keys) {
            int cnt1 = map1.getOrDefault(key, 0);
            int cnt2 = map2.getOrDefault(key, 0);
            low  += Math.min(cnt1, cnt2);  
            high += Math.max(cnt1, cnt2);  
        }

        return (int)((double) low / high * 65536);
    }
}