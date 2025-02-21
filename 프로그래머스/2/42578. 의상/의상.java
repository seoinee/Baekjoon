import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1); // 안 입는 경우 더하기
        }
        
        answer -= 1; // 모두 안 입었을 경우 제외
        
        return answer;
    }
}