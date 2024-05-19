package Leaderboard;

import java.util.Comparator;

import QuizGame.Player;

public class Cmp implements Comparator<Player>{

    @Override
    public int compare(Player p1, Player p2) {
        return Double.compare(p1.getTimeSpent(), p2.getTimeSpent());
    }
    
}
