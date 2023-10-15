class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        int len = phone_number.length();
        
        for(int i = 0; i < len-4; i++){
            sb.setCharAt(i, '*');
        }
        return sb.toString();
    }
}