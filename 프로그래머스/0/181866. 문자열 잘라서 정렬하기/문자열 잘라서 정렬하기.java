import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < answer.length; i++) 
            if(!answer[i].isEmpty())
                list.add(answer[i]);
        
        String[] result = list.toArray(new String[list.size()]);
        
        Arrays.sort(result);
        
        return result;
    }
}