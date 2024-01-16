import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] total = new int[friends.length][friends.length]; //주고 받은 선물을 담을 배열
        Map<String, Integer> map = new HashMap<>(); //선물 지수를 답을 Map

        for (String friend : friends) {
            map.put(friend, 0);
        }
        for (String gift : gifts) {
            String[] split = gift.split(" ");

            //주고 받은 선물
            int give = Arrays.asList(friends).indexOf(split[0]);
            int receive = Arrays.asList(friends).indexOf(split[1]);

            total[give][receive] += 1;

            //선물 지수
            map.put(split[0], map.get(split[0]) + 1);
            map.put(split[1], map.get(split[1]) - 1);
        }

        for (int i = 0; i < friends.length; i++) {
            int num = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i != j) {
                    if (total[i][j] > total[j][i]) { //준 선물이 많을 경우
                        num++;
                    } else if (total[i][j] == total[j][i]) { //주고 받은 수가 같을 경우
                        if (map.get(friends[i]) > map.get(friends[j])) {
                            num++;
                        }
                    }
                }
            }
            answer = Math.max(answer, num);
        }
        
        return answer;
    }
}