import java.util.*;

class Song{
    int idx;
    int pTime;
    
    public Song(int idx, int pTime){
        this.idx = idx;
        this.pTime = pTime;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        // 장르, 재생 횟수
        HashMap<String, Integer> map = new HashMap<>();
        // 장르의 빈도수
        HashMap<String, List<Song>> map2 = new HashMap<>();
        
        for(int i = 0 ; i < genres.length; i++){
            String g = genres[i];
            int p = plays[i];
            
            //장르별 재생 횟수 업데이트
            map.put(g,map.getOrDefault(g, 0) + p);
            map2.computeIfAbsent(g, k -> new ArrayList<>()).add(new Song(i,p));
        }
        
        List<Map.Entry<String,Integer>> list1 = new ArrayList<>(map.entrySet());
        
        Collections.sort(list1, (a,b) -> b.getValue() - a.getValue());
        
        List<Integer> ans = new ArrayList<>();
        
        for(var entry : list1){
            List<Song> tmp = map2.get(entry.getKey());
            Collections.sort(tmp, (a,b) -> {
                if(a.pTime == b.pTime) return a.idx - b.idx;
                else return b.pTime - a.pTime;      
            });
            ans.add(tmp.get(0).idx);
            if(tmp.size() > 1){
                ans.add(tmp.get(1).idx);
            }
        }
        
        int[] re = new int[ans.size()];
        
        for(int i = 0; i < ans.size(); i++){
            re[i] = ans.get(i);
        }
        
        return re;
    }
}