class Solution {
    public String solution(String my_string) {
        String[] v = {"a", "e", "i", "o", "u"};

        for(String s : v){
            my_string = my_string.replace(s,"");
        }
        
        return my_string;
    }
}