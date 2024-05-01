import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class DifficultyButtons extends JButton{
    
    JButton easyButton = new JButton("Easy");
    JButton mediumButton = new JButton("Medium");
    JButton hardButton = new JButton("Hard");

    public DifficultyButtons(){

        easyButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        easyButton.setPreferredSize(new java.awt.Dimension(200, 100));
        easyButton.setBackground(new Color(255, 255, 255));
        easyButton.setBorder(new LineBorder(Color.BLACK, 2, true));

        mediumButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        mediumButton.setPreferredSize(new java.awt.Dimension(200, 100));
        mediumButton.setBackground(new Color(255, 255, 255));
        mediumButton.setBorder(new LineBorder(Color.BLACK, 2, true));

        hardButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        hardButton.setPreferredSize(new java.awt.Dimension(200, 100));
        hardButton.setBackground(new Color(255, 255, 255));
        hardButton.setBorder(new LineBorder(Color.BLACK, 2, true));

    }
    
}
