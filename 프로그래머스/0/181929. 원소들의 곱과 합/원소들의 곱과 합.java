import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        
        for(int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
        }
        
        if(Math.pow(Arrays.stream(num_list).sum(), 2) > mul)
            answer = 1;
        
        return answer;
    }
}