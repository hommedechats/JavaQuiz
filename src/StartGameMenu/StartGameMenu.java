package StartGameMenu;

import Buttons.BackButton;
import Buttons.RulesButton;
import MainMenu.MainMenu;
import MainMenu.RulesPanel;
import QuizGame.QuizGame;

import javax.swing.*;
import java.awt.*;

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
            add(new QuizGame("data/easy.json").questionPanels());
            revalidate();
            repaint();
        });
        difficultyButtonsPanel.buttons.mediumButton.addActionListener(e -> {
            removeAll();
            add(new QuizGame("data/medium.json").questionPanels());
            revalidate();
            repaint();
        });
        difficultyButtonsPanel.buttons.hardButton.addActionListener(e -> {
            removeAll();
            add(new QuizGame("data/hard.json").questionPanels());
            revalidate();
            repaint();
        });
    }
}
