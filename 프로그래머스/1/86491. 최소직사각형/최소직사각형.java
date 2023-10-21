class Solution {
    public int solution(int[][] sizes) {
        int w_max = 0, h_max = 0;
        for(int[] size : sizes){
            int w = Math.max(size[0],size[1]);
            int h = Math.min(size[0],size[1]);
            
            if(w_max == 0 || w_max < w) w_max = w;
            if(h_max == 0 || h_max < h) h_max = h;
        }
        return w_max * h_max;
    }
}