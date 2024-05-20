package MainMenu;

import Leaderboard.LeaderboardMenu;
import StartGameMenu.StartGameMenu;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {

    public MainMenu(){
        MainMenuLabel mainMenuLabel = new MainMenuLabel("Main menu");
        MainMenuButtons buttons = new MainMenuButtons();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
        
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        gbc.gridy = 0;
        add(mainMenuLabel, gbc);
        gbc.gridy++;
        add(buttons.startGameButton, gbc);
        gbc.gridy++;
        add(buttons.leaderboardButton, gbc);

        buttons.startGameButton.addActionListener(e -> {
            removeAll();
            add(new StartGameMenu());
            revalidate();
            repaint();
        });
        buttons.leaderboardButton.addActionListener(e -> {
            removeAll();
            add(new LeaderboardMenu(0));
            revalidate();
            repaint();
        });
    }
}
