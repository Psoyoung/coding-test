class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] cipherList = cipher.toCharArray();
        
        for(int i = 0; i < cipherList.length; i++){
            if((i+1) % code == 0) answer += cipherList[i];
        }
        
        return answer;
    }
}