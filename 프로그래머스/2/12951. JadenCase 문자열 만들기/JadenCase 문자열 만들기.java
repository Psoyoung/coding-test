class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            if(!str.equals("")){
                sb.append(str.substring(0,1).toUpperCase());
                sb.append(str.substring(1));
            }
            if(arr.length-1 != i){
                sb.append(" ");
            }
        }
        
        if(s.substring(s.length()-1,s.length()).equals(" ")){
            sb.append(" ");
        };
        return sb.toString();
    }
}