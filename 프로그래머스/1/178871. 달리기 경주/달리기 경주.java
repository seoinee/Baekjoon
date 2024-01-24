import java.util.Map;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> rank = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        
        
        for(int i = 0; i < callings.length; i++) {
            int ownRank = rank.get(callings[i]);
            String beforePlayer = players[ownRank - 1];
            
            players[ownRank - 1] = callings[i];
            players[ownRank] = beforePlayer;
            
            rank.put(callings[i], ownRank - 1);
            rank.put(beforePlayer, ownRank);
        }
        
        return players;
    }
}