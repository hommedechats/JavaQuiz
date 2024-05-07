package QuizGame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class QuizGamePanel extends JPanel {

    public QuizGamePanel(String question, ArrayList<String> choices, String answer) {

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
        
        optionsPanel.addButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton)e.getSource();
                String option = button.getText();
                if(option.equals(answer)){  
                    System.out.println("Correct answer.");
                }
                else{
                    System.out.println("Wrong answer.");
                }
            }
        });
    }
}