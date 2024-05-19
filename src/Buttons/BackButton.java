package Buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class BackButton extends JButton {
    
    public BackButton() {
        super("Back");
        setBackground(new Color(255,255,255));
        setPreferredSize(new Dimension(200, 75));
        setBorder(new LineBorder(Color.BLACK, 2, true));
        setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 30));
    }

    public void addBackButtonListener(ActionListener listener) {
        this.addActionListener(listener);
    }
}
