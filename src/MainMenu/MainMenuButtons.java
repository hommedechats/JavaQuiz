package MainMenu;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

public class MainMenuButtons {
    
    JButton startGameButton = new JButton("Start Game");
    JButton leaderboardButton = new JButton("Leaderboard");

    MainMenuButtons(){
        startGameButton.setPreferredSize(new Dimension(500, 150));
        startGameButton.setBorder(new LineBorder(Color.BLACK, 2, true));
        startGameButton.setBackground(new Color(255, 255, 255));

        leaderboardButton.setPreferredSize(new Dimension(500, 150));
        leaderboardButton.setBorder(new LineBorder(Color.BLACK, 2, true));
        leaderboardButton.setBackground(new Color(255, 255, 255));
        
    }
}
