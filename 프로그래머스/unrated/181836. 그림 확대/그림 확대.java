import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String p : picture){
            StringBuilder sb = new StringBuilder();
            for(String str : p.split("")){
                sb.append(str.repeat(k));
            }
            for(int i = 0; i < k; i++){
                list.add(sb.toString());
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}