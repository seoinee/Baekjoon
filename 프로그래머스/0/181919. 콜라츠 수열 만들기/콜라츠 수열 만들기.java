import java.util.*; // arraylist, list 에서는 import 무조건
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>(); // 왜 자꾸 new 빼먹어!
        
        while(n != 1) {
            list.add(n);
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        list.add(1);
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}