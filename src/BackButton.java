import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class BackButton extends JButton {
    
    BackButton() {
        super("Back");
        setBackground(new Color(255,255,255));
        setPreferredSize(new Dimension(150, 50));
        setBorder(new LineBorder(Color.BLACK, 2, true));
    }

    public void addBackButtonListener(ActionListener listener) {
        this.addActionListener(listener);
    }
}
