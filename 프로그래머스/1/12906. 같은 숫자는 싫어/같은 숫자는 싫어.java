import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) { 
            if(stack.empty() || stack.peek() != arr[i]) { //스택이 비어있거나 직전 값과 다를 경우
                stack.push(arr[i]);
            }
        }
        
        return stack.stream().mapToInt(i->i).toArray();
    }
}