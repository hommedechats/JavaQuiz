package Leaderboard;

import QuizGame.Player;
import QuizGame.ReadFromJson;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class Leaderboard extends JPanel {
    
    private WriteToJson writeToJson = new WriteToJson("data/leaderboard.json");
    private ReadFromJson readFromJson = new ReadFromJson("data/leaderboard.json", true);
    private ArrayList<Player> leaderboard;
    private int playerCount = 1;
    // private boolean alreadyAdded = false;

    Leaderboard(){
        this.leaderboard = readFromJson.getLeaderboard();
        leaderboard.sort(new Cmp());
        setLayout(new GridLayout(0, 1));
        setSize(new Dimension(800, 400));
        setBorder(new LineBorder(java.awt.Color.BLACK, 2, true));
        populateLeaderboard();
    }

    public void addPlayer(Player player){
        leaderboard.add(player);
        leaderboard.sort(new Cmp());
        writeToJson.write(leaderboard);
        playerCount = 1;

        populateLeaderboard();
    }

    private void addPlayerLabel(Player player){
        String str = playerCount+"." + player.getName() + " " + player.getTimeSpent();
        JLabel playerLabel = new JLabel(str);
        playerLabel.setBorder(new CompoundBorder(playerLabel.getBorder(), new EmptyBorder(5, 5, 5, 5)));
        playerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        playerLabel.setHorizontalAlignment(JLabel.LEFT);
        playerLabel.setSize(new Dimension(800, 50));
        add(playerLabel);
        playerCount++;
    }

    private void populateLeaderboard(){
        removeAll();
        for (int i = 0; i < Math.min(leaderboard.size(), 10); i++) {
            Player player = leaderboard.get(i);
            addPlayerLabel(player);
        }
    }
}
