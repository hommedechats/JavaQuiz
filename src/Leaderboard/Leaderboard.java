package Leaderboard;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Leaderboard extends JPanel {
    
    Leaderboard(ArrayList<String> leaderboard){
        setLayout(new GridLayout(0, 1));
        setSize(new Dimension(800, 400));
        setBorder(new LineBorder(java.awt.Color.BLACK, 2, true));
        
        JLabel main_Label = new JLabel("TEST");
        main_Label.setFont(new Font("Arial", Font.BOLD, 15));
        main_Label.setSize(new Dimension(800, 50));
        add(main_Label);
        
        for (String player : leaderboard){
            addPlayerLabel(player);
        }      
    }


    private void addPlayerLabel(String player){
        JLabel playerLabel = new JLabel(player);
        playerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        playerLabel.setHorizontalAlignment(JLabel.LEFT);
        playerLabel.setSize(new Dimension(800, 50));
        add(playerLabel);
    }

}
