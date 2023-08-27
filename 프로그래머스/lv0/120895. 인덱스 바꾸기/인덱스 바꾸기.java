class Solution {
    public String solution(String my_string, int num1, int num2) {  
        char[] c_list = my_string.toCharArray();
        
        char tmp = c_list[num1];
        c_list[num1] = c_list[num2];
        c_list[num2] = tmp;
        
        return new String(c_list);
    }
}