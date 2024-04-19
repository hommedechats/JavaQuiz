import javax.swing.*;


import java.awt.*;

class QuestionPanel extends JPanel {
    public QuestionPanel(String question) {
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout); //centering
        JLabel questionLabel = new JLabel(question);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(questionLabel);
        setPreferredSize(new Dimension(400, 200));
    }
}
