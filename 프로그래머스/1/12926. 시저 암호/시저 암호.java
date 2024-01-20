class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            
            if (Character.isLowerCase(c)) {
                chars[i] = (char) ('a' + (c - 'a' + n) % 26);
            } else if (Character.isUpperCase(c)) {
                chars[i] = (char) ('A' + (c - 'A' + n) % 26);
            }
        }
        
        return new String(chars);
    }
}