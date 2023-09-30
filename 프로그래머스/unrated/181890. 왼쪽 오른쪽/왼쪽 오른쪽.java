import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = new String[0];
        
        int len = str_list.length;
        for(int i = 0; i < len; i++){
            if(str_list[i].equals("l")){
                answer = Arrays.copyOf(str_list,i);
                break;
            }
            else if(str_list[i].equals("r") && i < len){
                answer = Arrays.copyOfRange(str_list,i+1,len);
                break;
            }    
        }
        return answer;
    }
}