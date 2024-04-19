import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;

public class MainMenuButtons {
    
    JPanel leaderboardMenu = new LeadeaboardMenu();
    JPanel startGameMenu = new StartGameMenu();
    
    JButton startGameButton = new JButton("Start Game");
    JButton leaderboardButton = new JButton("Leaderboard");
    JButton backButton = new JButton("Back");

    MainMenuButtons(){

        startGameButton.setPreferredSize(new Dimension(500, 150));
        startGameButton.setBackground(new Color(255, 255, 255));



        leaderboardButton.setPreferredSize(new Dimension(500, 150));
        leaderboardButton.setBorder(new LineBorder(Color.BLACK, 2, true));
        leaderboardButton.setBackground(new Color(255, 255, 255));
        
        backButton.setPreferredSize(new Dimension(100, 45));
        //TODO: set location of back button to the top left corner bbz kaip
        backButton.setLocation(new Point(50, 50));
    }
}
