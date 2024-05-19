package StartGameMenu;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class DifficultyButtons extends JButton{
    
    JButton easyButton;
    JButton mediumButton;
    JButton hardButton;

    public DifficultyButtons(){

        easyButton = new JButton("Easy");
        mediumButton = new JButton("Medium");
        hardButton = new JButton("Hard");

        easyButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 30));
        easyButton.setPreferredSize(new java.awt.Dimension(300, 120));
        easyButton.setBackground(new Color(255, 255, 255));
        easyButton.setBorder(new LineBorder(Color.BLACK, 2, true));

        mediumButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 30));
        mediumButton.setPreferredSize(new java.awt.Dimension(300, 120));
        mediumButton.setBackground(new Color(255, 255, 255));
        mediumButton.setBorder(new LineBorder(Color.BLACK, 2, true));

        hardButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 30));
        hardButton.setPreferredSize(new java.awt.Dimension(300, 120));
        hardButton.setBackground(new Color(255, 255, 255));
        hardButton.setBorder(new LineBorder(Color.BLACK, 2, true));

    }
    
}
