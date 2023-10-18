class Solution {
    public boolean solution(String s) {
        boolean isDigit = s.matches("\\d+");
        boolean isLen = s.length() == 4 || s.length() == 6;

        return isDigit && isLen ? true : false;
    }
}