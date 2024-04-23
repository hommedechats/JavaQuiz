import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

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
            revalidate();
            repaint();
        });
    }

}
