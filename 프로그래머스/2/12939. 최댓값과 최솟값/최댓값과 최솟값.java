class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for(int i = 1; i < arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            if(max < num) max = num;
            if(min > num) min = num;
        }
        
        return min + " " + max;
    }
}