class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        return count(str,"p") == count(str,"y");
    }
    
    public static int count(String str, String c) {
        return str.length() - str.replace(c, "").length();
    }
}