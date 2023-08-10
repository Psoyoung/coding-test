class Solution {
    public String solution(String my_string) {
        String[] vowel = {"a", "e", "i", "o", "u"};

        for(String s : vowel){
            my_string = my_string.replace(s,"");
        }
        return my_string;
    }
}