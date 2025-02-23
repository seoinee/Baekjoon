import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐 
        
        for (int priority : priorities) {
            q.offer(priority);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == q.peek()) { // 현재 가장 높은 우선순위와 일치하는 경우
                    q.poll(); // 우선순위 큐에서 제거
                    answer++;

                    // 목표 위치 문서가 출력될 차례라면 return
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
