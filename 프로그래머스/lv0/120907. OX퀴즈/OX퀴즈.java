import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> arr = new ArrayList<>();
        for(String str:quiz){
            String[] n = str.split(" ");
            int a = Integer.parseInt(n[0]);
            int b = Integer.parseInt(n[2]);
            int c = Integer.parseInt(n[4]);
            
            switch(n[1]) {
                case "+": 
                    arr.add(a + b == c ? "O":"X");   
                    break;
                case "-":
                    arr.add(a - b == c ? "O":"X");
                    break;
            }
        }   
        return arr.stream().toArray(String[]::new);
    }
}