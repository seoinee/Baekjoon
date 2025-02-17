import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        
        if (arr1.length == arr2.length) {
            if (sum1 > sum2)
                answer = 1;
            else if (sum1 < sum2)
                answer = -1;
            else 
                answer = 0;
        } else {
            if (arr1.length > arr2.length)
                answer = 1;
            else 
                answer = -1;
        }
        return answer; 
    }
}