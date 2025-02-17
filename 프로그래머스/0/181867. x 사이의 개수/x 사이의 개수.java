import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i].length());
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}