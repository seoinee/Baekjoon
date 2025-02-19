import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for(int i = 0; i < indices.length; i++) {
            list.set(indices[i], "");
        }
        
        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}