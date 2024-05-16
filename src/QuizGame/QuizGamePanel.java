package QuizGame;

import javax.swing.*;

import EndGame.EndGamePanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class QuizGamePanel extends JPanel {

    private String answer;

    public QuizGamePanel(String question, ArrayList<String> choices, String answer) {
        Player player = Player.getInstance();
        Timer timer = Timer.getInstance();

        this.answer = answer;
        QuestionPanel questionPanel = new QuestionPanel(question);
        OptionsPanel optionsPanel = new OptionsPanel(choices);

        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;

        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(questionPanel, gbc);
        
        gbc.gridy = 1;
        add(optionsPanel, gbc);
        timer.startTimer();

        optionsPanel.addButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton)e.getSource();
                String option = button.getText();
                player.updateCurrentQuestionIndex();

                if(player.getCurrentQuestionIndex() >= 20){ //@change
                    System.out.println(player.getCurrentQuestionIndex());
                    timer.endTimer();
                    player.setTimeSpent(timer.getElapsedTimeMs());
                    System.out.println(player.getTimeSpent() / 1000);
                    getParent().add(new EndGamePanel());
                    
                }
                if(isCorrectAnswer(option)){
                    button.setText("Correct answer.");
                    player.increaseScore();
                    CardLayout cardLayout = (CardLayout) getParent().getLayout();
                    cardLayout.next(getParent());
                }
                else{
                    button.setText("Wrong answer.");
                    timer.addTime(10);
                    CardLayout cardLayout = (CardLayout) getParent().getLayout();
                    cardLayout.next(getParent());
                }
            }
        });
    }

    private boolean isCorrectAnswer(String option) {
        return option.equals(answer);
    }

}