import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        
        BigInteger sum = bigA.add(bigB);
        
        answer = sum.toString();
        
        return answer;
    }
}