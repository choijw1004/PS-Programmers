import java.util.*;
import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger ab = new BigInteger(a);
        BigInteger ba = new BigInteger(b);
        
        return ab.add(ba).toString();
    }
}