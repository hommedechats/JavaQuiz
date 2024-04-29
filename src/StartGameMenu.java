import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class StartGameMenu extends JPanel {
    public StartGameMenu(){

        GridBagConstraints gbc = new GridBagConstraints();
        StartGameLabel gameStartLabel = new StartGameLabel();
        DifficultyButtonsPanel difficultyButtonsPanel = new DifficultyButtonsPanel();
        BackButton backButton = new BackButton();

        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(1000, 800));

        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        add(gameStartLabel, gbc);

        gbc.gridy = 1;
        add(difficultyButtonsPanel, gbc);

        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        add(backButton, gbc);


            
        backButton.addBackButtonListener(e -> {
            removeAll();
            add(new MainMenu());
            revalidate();
            repaint();
        });
        difficultyButtonsPanel.buttons.easyButton.addActionListener(e -> {
            removeAll();
            add(new QuizFrame("Quiz Game"));
            revalidate();
            repaint();
        });
        difficultyButtonsPanel.buttons.mediumButton.addActionListener(e -> {
            removeAll();
            add(new QuizFrame("Quiz Game"));
            revalidate();
            repaint();
        });
        difficultyButtonsPanel.buttons.hardButton.addActionListener(e -> {
            removeAll();
            add(new QuizFrame("Quiz Game"));
            revalidate();
            repaint();
        });
    }
}
