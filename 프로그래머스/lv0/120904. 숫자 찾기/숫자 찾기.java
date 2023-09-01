class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        char[] list = String.valueOf(num).toCharArray();
        for(int i = 0; i < list.length; i++){
            if(k == Character.getNumericValue(list[i])){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}