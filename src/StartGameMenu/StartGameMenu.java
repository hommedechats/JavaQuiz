package StartGameMenu;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

import Buttons.BackButton;
import Buttons.RulesButton;
import MainMenu.MainMenu;
import MainMenu.RulesPanel;
import QuizGame.QuizGameEasy;
import QuizGame.QuizGameMedium;
import QuizGame.QuizGameHard;

public class StartGameMenu extends JPanel {

    public StartGameMenu(){
        GridBagConstraints gbc = new GridBagConstraints();
        StartGameLabel gameStartLabel = new StartGameLabel();
        DifficultyButtonsPanel difficultyButtonsPanel = new DifficultyButtonsPanel();
        BackButton backButton = new BackButton();
        RulesButton rulesButton = new RulesButton();

        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(1000, 800));

        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        
        gbc.gridy = 0;
        // gbc.gridx = 0;s
        gbc.gridwidth = 2;
        add(gameStartLabel, gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(difficultyButtonsPanel, gbc);

        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(backButton, gbc);
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 1;
        add(rulesButton, gbc);

        
        backButton.addBackButtonListener(e -> {
            removeAll();
            add(new MainMenu());
            revalidate();
            repaint();
        });
        rulesButton.addRulesButtonListener(e -> {
            removeAll();
            add(new RulesPanel());
            revalidate();
            repaint();
        });
        difficultyButtonsPanel.buttons.easyButton.addActionListener(e -> {
            removeAll();
            add(new QuizGameEasy().questionPanels());
            revalidate();
            repaint();
        });
        difficultyButtonsPanel.buttons.mediumButton.addActionListener(e -> {
            removeAll();
            add(new QuizGameMedium().questionPanels());
            revalidate();
            repaint();
        });
        difficultyButtonsPanel.buttons.hardButton.addActionListener(e -> {
            removeAll();
            add(new QuizGameHard().questionPanels());
            revalidate();
            repaint();
        });
    }
}
