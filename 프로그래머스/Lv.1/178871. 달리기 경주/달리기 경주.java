import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> positions = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            positions.put(players[i], i);
        }

        for (String calling : callings) {
            int position = positions.get(calling);
            if (position > 0) {
                String overtaken = players[position - 1];
                players[position] = overtaken;
                players[position - 1] = calling;
                positions.put(overtaken, position);
                positions.put(calling, position - 1);
            }
        }
        
        return players;
    }
}