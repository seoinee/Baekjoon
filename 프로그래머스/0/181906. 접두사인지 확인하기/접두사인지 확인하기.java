class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        answer = my_string.indexOf(is_prefix);
        
        if (answer == 0) //인덱스가 0이면 1 반환
            return 1;
        
        return 0;
    }
}