class Solution {
    public String solution(String polynomial) {
        String[] str = polynomial.split(" ");
        int x = 0, n = 0;
        
        for(int i = 0; i < str.length; i+=2){
            if(str[i].contains("x")){
                if(str[i].length() == 1){
                   x++;
                }else{
                   String num = str[i].replaceAll("x","");
                   x+= Integer.parseInt(num);
                }
            }else{
                n+= Integer.parseInt(str[i]);
            }
        }
        
        String answer = "";
        if(x == 0){
            answer = n+"";
        }
        else if(n == 0){
            answer = x==1 ? "x" : x+"x";
        }
        else{
            answer = x==1 ? "x + "+n : x+"x + "+n;
        }
        
        return answer;
    }
}