import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    break;
                }
            }
            if (arr[i] != 0)
                list.add(arr[i]);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}