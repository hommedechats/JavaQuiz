package EndGame;

import Leaderboard.LeaderboardMenu;
import QuizGame.Player;
import StartGameMenu.StartGameMenu;

import javax.swing.*;
import java.awt.*;

public class EndGamePanel extends JPanel {

    private Player player;
    private JLabel endGameLabel;
    private JLabel scoreLabel;
    private JLabel timeSpentLabel;
    private JTextField nameField;
    private JButton restartButton;
    private JButton exitButton;
    private JButton leaderboardButton;
    private JButton submitButton;

    public EndGamePanel() {

        player = Player.getInstance();

        endGameLabel = new JLabel("Game Over!");
        scoreLabel = new JLabel("Your score: " + player.getScore()+"/20");
        timeSpentLabel = new JLabel("Time spent: " + player.getTimeSpent() / 1000 + "s");
        nameField = new JTextField("Enter your name");
        restartButton = createButton("Play again");
        exitButton = createButton("Exit");
        leaderboardButton = createButton("Leaderboard");
        submitButton = createButton("Submit");

        addButtonListeners();

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTH;

        endGameLabel.setFont(new Font("Arial", Font.BOLD, 80));
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        timeSpentLabel.setFont(new Font("Arial", Font.PLAIN, 40));

        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        gbc.gridy = 0;
        gbc.gridx = 1;
        add(endGameLabel, gbc);
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        add(scoreLabel, gbc);
        gbc.gridy = 2;
        add(timeSpentLabel, gbc);
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH;
        add(nameField, gbc);
        gbc.gridx = 1;
        add(submitButton, gbc);
        gbc.gridy = 4;
        gbc.gridx = 0;
        add(restartButton, gbc);
        gbc.gridy = 4;
        gbc.gridx = 1;
        add(leaderboardButton, gbc);
        gbc.gridy = 4;
        gbc.gridx = 2;
        add(exitButton, gbc);
    }

    private void addButtonListeners() {
        restartButton.addActionListener(e -> {
            player.setCurrentQuestionIndex(0);
            removeAll();
            add(new StartGameMenu());
            revalidate();
            repaint();
        });
        exitButton.addActionListener(e -> {
            System.exit(0);
        });
        leaderboardButton.addActionListener(e -> {
            removeAll();
            add(new LeaderboardMenu(1));
            revalidate();
            repaint();
        });
        submitButton.addActionListener(e -> {
            player.setName(nameField.getText());
            System.out.println("Name: " + player.getName() + " Score: " + player.getScore() + " Time: " + player.getTimeSpent() / 1000 + "s");
            nameField.setText("Saved score");
        });

    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 35));
        button.setPreferredSize(new java.awt.Dimension(300, 100));
        button.setBackground(new java.awt.Color(255, 255, 255));
        button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        return button;
    }

}
