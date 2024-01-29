class Solution {
    public String solution(String s) {
        String answer = "";
        String num[] = s.split(" ");
        int min = Integer.parseInt(num[0]);
        int max = Integer.parseInt(num[0]);
        
        for(int i = 0; i < num.length; i++) {
            int str = Integer.parseInt(num[i]);
            
            if(str < min) 
                min = str;
            if(str > max)
                max = str;
        }
        answer = min + " " + max;
        return answer;
    }
}