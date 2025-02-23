import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>(); //자동으로 정렬해줌
        
        for(int sc : scoville) {
            q.offer(sc);
        }
        while(q.peek() < K) {
            if(q.size() >= 2) {
                int min = q.peek();
                q.poll();
                q.offer(min + (q.peek() * 2));
                q.poll();
                answer++;
            } else {
                return -1;
            }
            
        }

        return answer;
    }
}