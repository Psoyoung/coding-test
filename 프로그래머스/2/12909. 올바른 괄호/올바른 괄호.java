import java.util.*;

class Solution {
    boolean solution(String s) {

        if(s.charAt(0) == ')') return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty() ? true : false;
    }
}