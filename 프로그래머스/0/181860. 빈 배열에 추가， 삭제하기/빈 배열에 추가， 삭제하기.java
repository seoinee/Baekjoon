import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                int num = arr[i];
                for(int j = 0; j < num * 2; j++) {
                    list.add(num);
                }
            } else {
                int num = arr[i];
                int size = list.size();
                for(int j = 0; j < num; j++) {
                    list.remove(size - j - 1);
                }
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}