class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp = a;
        if(a > b) {
            a = temp;
            a = b;
            b = temp;
        } 
        for(int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}