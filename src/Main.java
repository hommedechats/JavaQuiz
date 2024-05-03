import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Quiz Game");
            MainMenu mainMenu = new MainMenu();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setSize(1400, 800);
            frame.setVisible(true);
            frame.add(mainMenu);
            frame.revalidate();
        });
        while(true){
            if(MainMenu.getDifficulty() == 1){
                System.out.println("Difficulty: " + MainMenu.getDifficulty());
                //load easy questions
                // for(;;){
                    
                // }
            }
            else if(MainMenu.getDifficulty() == 2){
                System.out.println("Difficulty: " + MainMenu.getDifficulty());

                //load medium questions
            }
            else if(MainMenu.getDifficulty() == 3){
                System.out.println("Difficulty: " + MainMenu.getDifficulty());  
                //load hard questions
            }
        }
        
        // frame.add(quizPanel);
    }
}
