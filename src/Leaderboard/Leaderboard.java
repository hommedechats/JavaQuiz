package Leaderboard;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import QuizGame.Player;
import QuizGame.ReadFromJson;

public class Leaderboard extends JPanel {
    
    private ReadFromJson readFromJson = new ReadFromJson("D:\\Programming\\JavaQuiz\\data\\leaderboard.json", true);
    private ArrayList<Player> leaderboard;


    Leaderboard(){
        this.leaderboard = readFromJson.getLeaderboard();
        setLayout(new GridLayout(0, 1));
        setSize(new Dimension(800, 400));
        setBorder(new LineBorder(java.awt.Color.BLACK, 2, true));

        JLabel main_Label = new JLabel("TEST");
        main_Label.setFont(new Font("Arial", Font.BOLD, 15));
        main_Label.setSize(new Dimension(800, 50));
        add(main_Label);
        
        for (Player player : leaderboard){
            addPlayerLabel(player);
        }      
    }


    private void addPlayerLabel(Player player){
        String str = player.getName() + " " + player.getScore();
        JLabel playerLabel = new JLabel(str);
        playerLabel.setBorder(new CompoundBorder(playerLabel.getBorder(), new EmptyBorder(5, 5, 5, 5)));
        playerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        playerLabel.setHorizontalAlignment(JLabel.LEFT);
        playerLabel.setSize(new Dimension(800, 50));
        add(playerLabel);
    }

}
