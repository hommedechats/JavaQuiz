package Leaderboard;

import Buttons.BackButton;
import EndGame.EndGamePanel;
import MainMenu.MainMenu;
import QuizGame.Player;

import javax.swing.*;
import java.awt.*;

public class LeaderboardMenu extends JPanel {
    
    private LeaderboardLabel leaderboardLabel;
    private Leaderboard leaderboard;
    private BackButton backButton;
    private GridBagConstraints gbc;

    public LeaderboardMenu(int flag){

        leaderboardLabel = new LeaderboardLabel();
        backButton = new BackButton();
        gbc = new GridBagConstraints();
        leaderboard = new Leaderboard();

        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(1300, 600));
        
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.weightx = 0.25;
        gbc.weighty = 0.25;
        gbc.gridy = 0;
        add(leaderboardLabel, gbc);

        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        add(leaderboard, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        add(backButton, gbc);
        
        if(flag == 0){
            backButton.addBackButtonListener(e -> {
                removeAll();
                add(new MainMenu());
                revalidate();
                repaint();
            });
        }
        else{
            backButton.addBackButtonListener(e -> {
                
                removeAll();
                add(new EndGamePanel());
                revalidate();
                repaint();
            });
        }
    }

    public void addPlayer(Player player){
        leaderboard.addPlayer(player);
    }
}
