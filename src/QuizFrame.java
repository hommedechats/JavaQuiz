import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class QuizFrame extends JFrame {
    public QuizFrame(String title) {
        super(title);
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;

        QuestionPanel questionPanel = new QuestionPanel("What is the capital of France?");
        add(questionPanel, gbc);

        ArrayList<String> opa = new ArrayList<>();
        opa.add("Paris");
        opa.add("London");
        opa.add("Berlin");
        opa.add("Madrid");
        OptionsPanel optionsPanel = new OptionsPanel(opa);

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
}