class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        answer = my_string.indexOf(is_prefix);
        
        if (answer == 0) 
            return 1;
        
        return 0;
    }
}