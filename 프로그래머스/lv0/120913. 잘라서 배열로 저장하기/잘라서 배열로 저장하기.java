import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_str.length(); i+=n){
            if(my_str.length()-i < n){
                list.add(my_str.substring(i,my_str.length()));
            }   
            else{
                list.add(my_str.substring(i,i+n));
            }    
        }
        
        return list.toArray(new String[list.size()]);
    }
}