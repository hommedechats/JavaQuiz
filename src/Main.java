import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Quiz Game");
            JPanel mainMenu = new MainMenu();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setSize(1400, 800);
            frame.setVisible(true);
            frame.add(mainMenu);
            // frame.add(quizPanel);
        });
    }
}
