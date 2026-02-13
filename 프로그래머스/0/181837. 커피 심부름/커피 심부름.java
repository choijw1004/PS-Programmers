class Solution {
    public int solution(String[] order) {
        int sum = 0;
        
        for(String s: order){
            if(s.contains("americano")) sum += 4500;
            else if(s.contains("cafelatte")) sum += 5000;
            else if(s.contains("anything")) sum += 4500;
        }
        
        return sum;
    }
}