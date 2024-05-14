package StartGameMenu;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartGameLabel extends JPanel {
    
    StartGameLabel(){
        JLabel gameStartLabel = new JLabel("Select the difficulty level to start the game");
        gameStartLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 35));
        gameStartLabel.setHorizontalAlignment(SwingConstants.CENTER);
        setPreferredSize(new Dimension(1000, 200));
        add(gameStartLabel);


        
    }

}
