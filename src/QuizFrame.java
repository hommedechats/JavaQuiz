import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class QuizFrame extends JPanel {

    // 1 - easy 2 - medium 3 - hard
    private int difficulty;

    public QuizFrame(String title) {
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 0;

        QuestionPanel questionPanel = new QuestionPanel("What is the capital of France?");
        add(questionPanel, gbc);
        
        ArrayList<String> choices = new ArrayList<String>();
        setDifficulty();

        if(difficulty == 1){
            choices = diffEasy();
        }
        else if(difficulty == 2){
            choices = diffMedium();
        }
        else if(difficulty == 3){
            choices = diffHard();
        }

        OptionsPanel optionsPanel = new OptionsPanel(choices);

        optionsPanel.addButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton)e.getSource();
                String option = button.getText();
                button.setText("Opa");
                // Here, you can handle the button click event
                System.out.println("Button " + option + " clicked.");
            }
        });
        gbc.gridy = 1;
        add(optionsPanel, gbc);
    }

    private ArrayList<String> diffEasy() {
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Vilnius");
        choices.add("Warsaw");
        choices.add("Baku");
        choices.add("Riga");
        return choices;
    }

    private ArrayList<String> diffMedium() {
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Tallin");
        choices.add("Helsinki");
        choices.add("Oslo");
        choices.add("Stockholm");
        return choices;
    }

    private ArrayList<String> diffHard() {
        ArrayList<String> choices = new ArrayList<>();
        choices.add("London");
        choices.add("Berlin");
        choices.add("Madrid");
        choices.add("paris");
        return choices;
    }

    private void setDifficulty() {
        if(MainMenu.getDifficulty() == 1){
            difficulty = 1;
        }
        else if(MainMenu.getDifficulty() == 2){
            difficulty = 2;
        }
        else if(MainMenu.getDifficulty() == 3){
            difficulty = 3;
        }
    }
}