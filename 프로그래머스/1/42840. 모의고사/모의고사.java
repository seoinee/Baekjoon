import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5}; 
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        
        for(int i = 0; i < answers.length; i++) { 
            if(p1[i % 5] == answers[i]) scores[0]++;
            if(p2[i % 8] == answers[i]) scores[1]++;
            if(p3[i % 10] == answers[i]) scores[2]++;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}