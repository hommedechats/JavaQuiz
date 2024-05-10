package QuizGame;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;


public class QuizGameEasy{

    private String filename = "D:\\Programming\\JavaQuiz\\data\\easy.json"; // "hard.txt
    private ArrayList<Question> questions;
    private int currentQuestionIndex = 0;
    private Player player;

    public QuizGameEasy() {
        player = new Player();
        ReadFromJson readFromJson = new ReadFromJson(filename);
        questions = readFromJson.getQuestions();
        printAllQuestions();
    }

    private void printAllQuestions() {
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            System.out.println(q.getAnswer());
            System.out.println(q.getOptions());
        }
    }
    
    public JPanel questionPanels(){
        int i = 0;
        JPanel cards = new JPanel(new CardLayout());
        for ( i = 0 ; i < 1 ; i++ ) {
            cards.add(initPanel());
        }
        return cards;
    }
    
    private QuizGamePanel initPanel(){
        if(currentQuestionIndex < questions.size()){
            Question q = questions.get(currentQuestionIndex);
            nextQuestion();
            return new QuizGamePanel(q.getQuestion(), q.getOptions(), q.getAnswer());
        }
        return null;
    }

    private void nextQuestion(){
        currentQuestionIndex++;
    }

}