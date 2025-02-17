class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] arr = myString.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo("l") < 0)
                answer += "l";
            else 
                answer += arr[i];
        }
        return answer;
    }
}