import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            JFrame frame = new JFrame("Quiz Game");
            JPanel quizPanel = new QuizFrame("Quiz Game");
            JPanel mainMenu = new MainMenu();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setSize(1300, 700);
            frame.setVisible(true);
            frame.add(mainMenu);
            // frame.add(quizPanel);
        });
    }
}
