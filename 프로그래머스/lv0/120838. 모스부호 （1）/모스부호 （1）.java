import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] letters = letter.split(" ");
        String[] pw = {".-","-...","-.-.","-..",".","..-.","--.","....",".."
                    ,".---","-.-",".-..","--","-.","---",".--.","--.-",".-."
                    ,"...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String le : letters){
            int radix = Arrays.asList(pw).indexOf(le)+97;
            answer+= (char)radix;
        }
        return answer;
    }
}