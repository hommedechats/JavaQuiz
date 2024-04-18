import javax.swing.*;
import java.awt.*;

class QuestionPanel extends JPanel {
    public QuestionPanel(String question) {
        setLayout(new GridBagLayout()); //centering
        JLabel questionLabel = new JLabel(question);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(questionLabel);
        setPreferredSize(new Dimension(400, 200));
    }
}
