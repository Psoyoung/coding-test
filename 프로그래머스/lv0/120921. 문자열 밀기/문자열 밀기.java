class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String str = A;
        for (int i = 0; i < A.length(); i++){
            if(str.equals(B)){
                return answer;
            }
            str = str.substring(str.length()-1)
                + str.substring(0, str.length()-1);

            answer++;
        }
        return -1;
    }
}