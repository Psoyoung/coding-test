class Solution {
    public String solution(String new_id) {
        
        new_id = new_id.toLowerCase() //소문자로 치환
                       .replaceAll("[^a-z0-9._-]", "") //특수문자 제거
                       .replaceAll("\\.{2,}", ".") //마침표 2개 이상 하나로
                       .replaceAll("^\\.|\\.$", ""); //처음과 끝 마침표 제거

        if(new_id.isEmpty()) new_id = "a"; //빈 문자열일 경우 a대입
        if(new_id.length() >= 16) { //16자 이상일 경우 15자, 끝 자리 마침표 제거
            new_id = new_id.substring(0, 15)
                           .replaceAll("\\.$", "");
        }
        while(new_id.length() <= 2) { //2자 이하일 경우 끝에 붙이기
            new_id += new_id.charAt(new_id.length()-1);
        }
        
        return new_id;
    }
}