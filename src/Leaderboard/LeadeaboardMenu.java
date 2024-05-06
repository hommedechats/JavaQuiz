package Leaderboard;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JPanel;

import Buttons.BackButton;
import MainMenu.MainMenu;

public class LeadeaboardMenu extends JPanel {
    
    public LeadeaboardMenu(){

        LeaderboardLabel leaderboardLabel = new LeaderboardLabel();
        BackButton backButton = new BackButton();
        GridBagConstraints gbc = new GridBagConstraints();

        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(1300, 600));
        // this.setBorder(new LineBorder(Color.BLACK, 2, true));
        
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.weightx = 0.25;
        gbc.weighty = 0.25;
        gbc.gridy = 0;
        add(leaderboardLabel, gbc);
        
        ArrayList<String> list = new ArrayList<>();
        list.add("1. Jonas 100");
        list.add("2. Petras 90");
        list.add("3. Ona 80");
        list.add("4. Jurgis 70");
        list.add("5. Marija 60");
        list.add("1. Jonas 100");
        list.add("2. Petras 90");
        list.add("3. Ona 80");
        list.add("4. Jurgis 70");
        list.add("5. Marija 60");
        Leaderboard leaderboard = new Leaderboard(list);
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        add(leaderboard, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        add(backButton, gbc);
        
        backButton.addBackButtonListener(e -> {
            removeAll();
            add(new MainMenu());
            revalidate();
            repaint();
        });
    }
}
