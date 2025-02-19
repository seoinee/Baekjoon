import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < strArr.length; i++) {
            int k = strArr[i].length();
            
            if(map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }
        int max = 0;
        
        for(Integer num : map.values()) {
            if (num >= max)
                max = num;
        }
        
        return max;
    }
}