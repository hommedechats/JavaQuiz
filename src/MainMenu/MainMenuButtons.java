package MainMenu;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

public class MainMenuButtons {
    
    JButton startGameButton;
    JButton leaderboardButton;

    MainMenuButtons(){

        startGameButton = new JButton("Start Game");
        leaderboardButton = new JButton("Leaderboard");

        startGameButton.setPreferredSize(new Dimension(500, 150));
        startGameButton.setBorder(new LineBorder(Color.BLACK, 2, true));
        startGameButton.setFont(new Font("Arial", Font.BOLD, 50));
        startGameButton.setBackground(new Color(255, 255, 255));

        leaderboardButton.setPreferredSize(new Dimension(500, 150));
        leaderboardButton.setBorder(new LineBorder(Color.BLACK, 2, true));
        leaderboardButton.setFont(new Font("Arial", Font.BOLD, 50));
        leaderboardButton.setBackground(new Color(255, 255, 255));
        
    }
}
