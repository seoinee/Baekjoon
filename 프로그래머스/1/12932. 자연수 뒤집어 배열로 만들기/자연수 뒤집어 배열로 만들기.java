class Solution {
    public int[] solution(long n) {
        String s = "" + n;
        int[] answer = new int[s.length()];
        
        int i = 0;
        while(n > 0) {
            answer[i] = (int)(n % 10);
            n = (int)(n / 10);
            i++;
        }
        return answer;
    }
}