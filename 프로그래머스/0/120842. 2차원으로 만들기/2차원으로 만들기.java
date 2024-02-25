class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int i = 0;
        
        for(int k = 0; k < num_list.length / n; k++) {
            for(int m = 0; m < n; m++) {
                answer[k][m] = num_list[i++];
            }
        }

        return answer;
    }
}