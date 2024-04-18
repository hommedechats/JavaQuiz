import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QuizFrame frame = new QuizFrame("Quiz Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 900);
            frame.setVisible(true);

        });
    }
}
