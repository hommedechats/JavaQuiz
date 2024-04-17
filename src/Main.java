import javax.swing.*;
import java.awt.*;
import java.awt.image.ColorConvertOp;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Quiz Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a panel for the question
            JPanel questionPanel = new JPanel();
            JLabel questionLabel = new JLabel("What is the capital of France?");
            questionLabel.setFont(new Font("Arial", Font.BOLD, 20));

            questionPanel.add(questionLabel);
            questionPanel.setBackground(Color.getHSBColor(34,34,34));
            questionPanel.setPreferredSize(new Dimension(200, 200));
            questionLabel.setHorizontalAlignment(JLabel.LEFT);
            questionPanel.setLayout(new GridBagLayout());
            // Create a panel for the options
            JPanel optionsPanel = new JPanel(new GridLayout(4, 1));

            // Create buttons for options
            JButton optionA = new JButton("A. London");
            JButton optionB = new JButton("B. Paris");
            JButton optionC = new JButton("C. Berlin");
            JButton optionD = new JButton("D. Rome");

            optionA.setBackground(Color.getHSBColor(34,85,90));

            // Add buttons to the options panel
            optionsPanel.add(optionA);
            optionsPanel.add(optionB);
            optionsPanel.add(optionC);
            optionsPanel.add(optionD);

            // Add panels to the frame
            frame.setLayout(new BorderLayout());
            frame.add(questionPanel, BorderLayout.NORTH);
            frame.add(optionsPanel, BorderLayout.CENTER);

            // Set frame size and make it visible
            frame.setSize(600, 900);
            frame.setVisible(true);
        });

    }

}
