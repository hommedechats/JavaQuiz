

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JPanel;

public class LeadeaboardMenu extends JPanel {
    
    public LeadeaboardMenu(){
        LeaderboardLabel leaderboardLabel = new LeaderboardLabel();
        BackButton backButton = new BackButton();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
        
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.weightx = 0.25;
        gbc.weighty = 0.25;
        gbc.gridy = 0;
        add(leaderboardLabel, gbc);
        
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        ArrayList<String> list = new ArrayList<>();
        list.add("1. Jonas 100");
        list.add("2. Petras 90");
        list.add("3. Ona 80");
        list.add("4. Jurgis 70");
        list.add("5. Marija 60");
        Leaderboard leaderboard = new Leaderboard(list);
        add(leaderboard, gbc);

        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        gbc.gridy = 2;
        add(backButton, gbc);
        
        backButton.addActionListener(e -> {

            removeAll();
            add(new MainMenu()); // klausimas ar gerai taip bet for testing works
            revalidate();
            repaint();
        });
        validate();
    }
    

}
