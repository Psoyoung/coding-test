class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            answer[i] = 1;
            double a = (score[i][0]+score[i][1])/2.0;
            for(int j = 0; j < score.length; j++){
                double b = (score[j][0]+score[j][1])/2.0;
                if( a < b){
                   answer[i] = answer[i]+1;    
                }
            }    
        }
        return answer;
    }
}