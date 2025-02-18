class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] arr = my_string.split("");
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        
        for(int i = 0; i < s; i++) {
            answer += arr[i];
        }   
        
        answer += sb.reverse().toString();
        
        for(int i = e + 1; i < my_string.length(); i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}