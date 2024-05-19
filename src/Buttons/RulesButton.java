package Buttons;

import javax.swing.JButton;

public class RulesButton extends JButton {
    
    public RulesButton() {
        super("Rules");
        setBackground(new java.awt.Color(255,255,255));
        setPreferredSize(new java.awt.Dimension(200, 75));
        setBorder(new javax.swing.border.LineBorder(java.awt.Color.BLACK, 2, true));
        setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 30));
    }

    public void addRulesButtonListener(java.awt.event.ActionListener listener) {
        this.addActionListener(listener);
    }

}
