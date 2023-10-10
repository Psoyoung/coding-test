import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length - 1; i++){
            String stan = phone_book[i];
            String temp = phone_book[i + 1];
            
            if(temp.startsWith(stan)){
               answer = false;
               break;
            } 
        }
        
        return answer;
    }
}