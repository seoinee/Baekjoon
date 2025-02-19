import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        List<String> list = new ArrayList<>();
        
        answer = myStr.split(" ");
        
        for(int i = 0; i < answer.length; i++) {
            if(!answer[i].isEmpty()){
                list.add(answer[i]);
            }
        }
        if(list.size() == 0) {
            list.add("EMPTY");
        }
        answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}