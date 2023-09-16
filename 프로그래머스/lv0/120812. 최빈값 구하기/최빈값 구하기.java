class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[1000];

        for(int i=0; i<array.length; i++) {
            arr[array[i]]++;
        }

        int index = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;

            }
        }

        int a = 0; //최빈값이 겹치는지 비교
        for(int i=0; i<arr.length; i++) {
            if(max == arr[i]) a++;
        }

        answer = a > 1 ? -1 : index;
        return answer;
    }
}
