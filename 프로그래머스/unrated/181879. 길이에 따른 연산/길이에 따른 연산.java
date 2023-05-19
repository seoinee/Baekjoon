class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int i;
        if (num_list.length <= 10) {
            answer = 1;
            for (i = 0; i < num_list.length; i++) 
                answer *= num_list[i];
        }
            
        else 
            for (i = 0; i < num_list.length; i++) 
                answer += num_list[i];
    
        return answer;
    }
}