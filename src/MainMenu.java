import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
import javax.swing.JPanel;

public class MainMenu extends JPanel {
    public MainMenu(){
        JLabel mainMenuLabel = new JLabel("Main Menu\n QUIZ GAME");
        MainMenuButtons buttons = new MainMenuButtons();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.CENTER;
        add(mainMenuLabel, gbc);

        buttons.startGameButton.addActionListener(e -> {
            removeAll();
            add(buttons.backButton);
            add(new StartGameMenu());
            revalidate();
            repaint();
        });
        buttons.leaderboardButton.addActionListener(e -> {
            removeAll();
            add(buttons.backButton);
            add(new LeadeaboardMenu());
            revalidate();
            repaint();
        });
        buttons.backButton.addActionListener(e -> {
            removeAll();
            add(new MainMenu()); // klausimas ar gerai taip bet for testing works
            // add(buttons.startGameButton);
            // add(buttons.leaderboardButton);
            revalidate();
            repaint();
        });
        gbc.gridy++;
        add(buttons.startGameButton, gbc);
        gbc.gridy++;
        add(buttons.leaderboardButton, gbc);
    }

}
