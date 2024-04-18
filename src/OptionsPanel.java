import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class OptionsPanel extends JPanel {
    public OptionsPanel(ArrayList<String> list) {
        setLayout(new GridLayout(4, 1));
        addButton("A");
        addButton("B");
        addButton("C");
        addButton("D");
    }

    public void addButtonListener(ActionListener listener) {
        for (Component component : getComponents()) {
            if (component instanceof JButton) {
                ((JButton) component).addActionListener(listener);
            }
        }
    }

    public void addButton(String text) {
        JButton button = new JButton(text);
        add(button);
    }
}