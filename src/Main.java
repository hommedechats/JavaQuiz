import MainMenu.MainMenu;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz Game");
        MainMenu mainMenu = new MainMenu(); 
        SwingUtilities.invokeLater(() -> {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setSize(1400, 800);
            frame.setVisible(true);
            frame.add(mainMenu);
            frame.revalidate();
        });
        
        // frame.add(quizPanel);
    }
    

}
