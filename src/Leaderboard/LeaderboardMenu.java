package Leaderboard;

import Buttons.BackButton;
import MainMenu.MainMenu;

import javax.swing.*;
import java.awt.*;

public class LeaderboardMenu extends JPanel {
    //leaderboard
    public LeaderboardMenu(){
        LeaderboardLabel leaderboardLabel = new LeaderboardLabel();
        BackButton backButton = new BackButton();
        GridBagConstraints gbc = new GridBagConstraints();

        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(1300, 600));
        // this.setBorder(new LineBorder(Color.BLACK, 2, true));
        
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.weightx = 0.25;
        gbc.weighty = 0.25;
        gbc.gridy = 0;
        add(leaderboardLabel, gbc);

        Leaderboard leaderboard = new Leaderboard();
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        add(leaderboard, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        add(backButton, gbc);
        
        backButton.addBackButtonListener(e -> {
            removeAll();
            add(new MainMenu());
            revalidate();
            repaint();
        });
    }
}
