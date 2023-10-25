class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        boolean upper = true;
        for(String str : s.split("")){
            if(upper){
                sb.append(str.toUpperCase());
            }else{
                sb.append(str.toLowerCase());
            }

            upper = !upper;
            if(str.equals(" ")){
                upper = true;
            }
        }
        return sb.toString();
    }
}