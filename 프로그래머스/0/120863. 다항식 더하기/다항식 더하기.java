class Solution {
    public String solution(String polynomial) {
        String[] tmp = polynomial.split(" ");
        int xCount = 0;
        int nCount = 0;
        
        for (String st : tmp) {
            if (st.contains("x")) {
                String num = st.replace("x", "");
                xCount += num.isEmpty() ? 1 : Integer.parseInt(num);
            } else if (!st.equals("+")) {
                nCount += Integer.parseInt(st);
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        if (xCount != 0) {
            ans.append(xCount == 1 ? "x" : xCount + "x");
        }
        if (nCount != 0) {
            if (ans.length() > 0) ans.append(" + ");
            ans.append(nCount);
        }
        
        return ans.toString();
    }
}