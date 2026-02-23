import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        List<String> cache = new ArrayList<>();
        
        if(cacheSize == 0) return cities.length * 5;
        int time = 0;
        
        for(var city : cities){
            String c = city.toLowerCase();
            
            //cache hit
            if(cache.contains(c)){
                cache.remove(c);
                cache.add(c);
                time += 1;
            }
            
            //cache miss
            else{
                if(cache.size() >= cacheSize){
                    cache.remove(0);
                }
                cache.add(c);
                time += 5;
            }
        }
        
        return time;
    }
}