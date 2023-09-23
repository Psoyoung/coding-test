class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int middleNum = total / num;
        int subNum = total % num == 0 ? num / 2 : num / 2 - 1;

        int startNum = middleNum - subNum;

        for (int i = 0; i < num; i++) {
            answer[i]= startNum + i; 
        }
        return answer;
    }
}