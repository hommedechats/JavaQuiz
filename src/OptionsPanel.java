import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class OptionsPanel extends JPanel {
    public OptionsPanel(ArrayList<String> list) {
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weightx = 0.25;
        gbc.weighty = 0.25;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        int i = 1;
        for (String option : list) {
            addButton(option, gbc);
            gbc.gridx++;
            if (i % 2 == 0) {
                gbc.gridy++;
                gbc.gridx = 0;
            }
            i++;
        }

    }

    public void addButtonListener(ActionListener listener) {
        for (Component component : getComponents()) {
            if (component instanceof JButton) {
                ((JButton) component).addActionListener(listener);
            }
        }
    }

    private void addButton(String text, GridBagConstraints gbc) {
        JButton button = new JButton(text);
        // button.setFont(new Font("Arial", Font.PLAIN, 25));
        button.setBackground(new Color(255, 255, 255));
        button.setPreferredSize(new Dimension(300, 150));
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
        add(button, gbc);
    }

}
