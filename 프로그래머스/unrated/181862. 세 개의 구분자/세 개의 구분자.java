class Solution {
    public String[] solution(String myStr) {
        String str = myStr.replaceAll("[abc,]+"," ").trim();
        
        if(str.equals("")){
            return new String[]{"EMPTY"};
        }
        
        return str.split(" ");
    }
}