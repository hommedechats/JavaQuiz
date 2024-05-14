package MainMenu;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainMenuLabel extends JLabel{

    public MainMenuLabel(String text){
        super(text);
        setHorizontalAlignment(SwingConstants.CENTER); // Set the horizontal alignment to center
        setFont(new Font("Arial", Font.BOLD, 80));
        setPreferredSize(new Dimension(500, 200));
    }

}
