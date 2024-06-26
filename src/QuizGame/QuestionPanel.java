package QuizGame;

import javax.swing.*;
import java.awt.*;

class QuestionPanel extends JPanel {
    public QuestionPanel(String question) {
        GridBagLayout layout = new GridBagLayout();
        JLabel questionLabel = new JLabel(question);

        setLayout(layout);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 40));
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(questionLabel);
        setPreferredSize(new Dimension(400, 200));
    }
}
