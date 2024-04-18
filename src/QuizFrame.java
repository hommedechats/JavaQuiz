import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class QuizFrame extends JFrame {
    public QuizFrame(String title) {
        super(title);
        setLayout(new BorderLayout());

        QuestionPanel questionPanel = new QuestionPanel("What is the capital of France?");
        add(questionPanel, BorderLayout.NORTH);

        ArrayList<String> opa = new ArrayList<>();
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
        add(optionsPanel, BorderLayout.CENTER);
    }
}