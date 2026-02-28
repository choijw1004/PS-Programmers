import java.util.*;

class File{
    String head;
    int number;
    int idx;
    
    public File(String head, int number, int idx){
        this.head = head;
        this.number = number;
        this.idx = idx;
    }
}
class Solution {
    public String[] solution(String[] files) {
        List<File> list = new ArrayList<>();
        //파일 인덱스
        int idx = 0;
        
        for(var f : files){
            //foo9.txt
            //foo010bar020.zip	
            //F-15
            int start = 0;
            StringBuilder h = new StringBuilder();
            
            //head 완성
            while(!Character.isDigit(f.charAt(start))){
                h.append(f.charAt(start));
                start++;
            }
            String tmp1 = h.toString();
            
            String nt = f.substring(start, f.length());
            
            start = 0;
            StringBuilder n = new StringBuilder();
            
            while(start < nt.length() && Character.isDigit(nt.charAt(start))){
                n.append(nt.charAt(start));
                start++;
            }
            
            int tmp2 = Integer.parseInt(n.toString());
            
            list.add(new File(tmp1,tmp2,idx));
            idx++;
        }
        
        Collections.sort(list, (a, b) -> {
            String ah = a.head.toLowerCase();
            String bh = b.head.toLowerCase();

            int headCmp = ah.compareTo(bh);
            if (headCmp != 0) return headCmp;

            return a.number - b.number;
        });
        
        String[] result = new String[files.length];
        
        for (int i = 0; i < list.size(); i++) {
            result[i] = files[list.get(i).idx];
        }
        return result;
    }
}