import java.util.*;
class Book{
    int start;
    int end;
    
    public Book(int start, int end){
        this.start = start;
        this.end = end;
    }
}
class Solution {
    public int solution(String[][] book_time) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Book> list = new ArrayList<>();
        
        for(var b : book_time){
            String[] sArr = b[0].split(":");
            String[] eArr = b[1].split(":");
            
            list.add(new Book(
                (Integer.parseInt(sArr[0]) * 60) + Integer.parseInt(sArr[1])
            ,
                (Integer.parseInt(eArr[0]) * 60) + (Integer.parseInt(eArr[1])) + 10
            ));
        }
        Collections.sort(list, (a,b) -> a.start - b.start);
        
        for(int i = 0; i < list.size(); i++){
            if(!pq.isEmpty() && pq.peek() <= list.get(i).start){
                pq.poll();
                pq.add(list.get(i).end);
            }
            
            else pq.add(list.get(i).end);
        }
        return pq.size();   
    }
}