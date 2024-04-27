import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;


public class DifficultyButtonsPanel extends JPanel{
    
    DifficultyButtons buttons = new DifficultyButtons();

    public DifficultyButtonsPanel(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        add(buttons.easyButton, gbc);
        add(buttons.mediumButton, gbc);
        add(buttons.hardButton, gbc);

    }

}
