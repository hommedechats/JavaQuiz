import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LeaderboardLabel extends JPanel {
    
    LeaderboardLabel(){
        JLabel leaderboardLabel = new JLabel("Leaderboard");
        leaderboardLabel.setHorizontalAlignment(SwingConstants.CENTER);
        leaderboardLabel.setFont(new Font("Arial", Font.BOLD, 50));
        setPreferredSize(new Dimension(500, 200));
        add(leaderboardLabel);
    }

}
