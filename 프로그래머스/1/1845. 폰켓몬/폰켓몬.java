import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>(); // 중복 제거, int[] 는 aslist 사용 불가
        
        for(int num : nums) {
            set.add(num);
        }
        
        if(nums.length / 2 <= set.size()) {
            answer = nums.length / 2;
        } else {
            answer = set.size();
        }
        return answer;
    }
}