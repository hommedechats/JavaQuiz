package MainMenu;

import java.awt.GridBagConstraints;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import Buttons.BackButton;
import StartGameMenu.StartGameMenu;



public class RulesPanel extends JPanel{
    
    private JLabel label;
    private JPanel rules;

    public RulesPanel(){
        label = new JLabel("RULES");
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 50));
        label.setHorizontalAlignment(JLabel.CENTER);
        
        rules = new JPanel();
        rules.setLayout(new java.awt.GridLayout(7, 1));
        rules.setBorder(new javax.swing.border.LineBorder(java.awt.Color.BLACK, 2, true));
        
        addRuleLabel("1. The game has 3 difficulties: easy, medium and hard.");
        addRuleLabel("2. Each difficulty has 20 questions.");
        addRuleLabel("3. The main goal is to answer as many questions correct as quickly as possible.");
        addRuleLabel("4. Your score is determined by the number of correct answers and the time");
        addRuleLabel(" it took to finish the game.");
        addRuleLabel("5. For each wrong answer 10 seconds get added to your time.");
        addRuleLabel("6. The game ends when you finish all the questions.");
        
        
        BackButton backButton = new BackButton();
        
        GridBagConstraints gbc = new GridBagConstraints();
        this.setLayout(new java.awt.GridBagLayout());
        gbc.fill = java.awt.GridBagConstraints.NONE;
        gbc.anchor = java.awt.GridBagConstraints.NORTH;
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        
        gbc.gridy = 0;
        add(label, gbc);

        gbc.gridy = 1;
        add(rules, gbc);

        gbc.gridy = 2;
        gbc.anchor = java.awt.GridBagConstraints.LINE_START;
        add(backButton, gbc);
        
        backButton.addBackButtonListener(e -> {
            removeAll();
            add(new StartGameMenu());
            revalidate();
            repaint();
        });
    }

    private void addRuleLabel(String text){
        JLabel ruleLabel = new JLabel(text);
        ruleLabel.setBorder(new CompoundBorder(ruleLabel.getBorder(), new EmptyBorder(20, 20, 20, 20)));
        ruleLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 30));
        ruleLabel.setHorizontalAlignment(JLabel.LEFT);
        rules.add(ruleLabel);
    }

}
