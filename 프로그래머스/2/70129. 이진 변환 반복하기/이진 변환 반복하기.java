class Solution {
    public int[] solution(String s) {
        int num = 0, count = 0;

        while(!s.equals("1")){
            num++;
            count += (int)s.chars().filter(c-> c == '0').count();

            s = s.replaceAll("0","");
            s = Integer.toBinaryString(s.length());
        }
        
        return new int[]{num, count};
    }
}