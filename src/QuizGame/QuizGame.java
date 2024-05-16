package QuizGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class QuizGame{

    private ArrayList<Question> questions;
    private int questionIndex = 0;
    private final int QUESTION_COUNT = 20;

    public QuizGame(String filename) {
        Player player = Player.getInstance();
        player.setName("opa");
        ReadFromJson readFromJson = new ReadFromJson(filename);
        questions = readFromJson.getQuestions();
        printAllQuestions();;
    }

    private void printAllQuestions() {
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            System.out.println(q.getAnswer());
            System.out.println(q.getOptions());
        }
    }
    
    public JPanel questionPanels(){
        JPanel cards = new JPanel(new CardLayout());
        for (int i = 0 ; i < QUESTION_COUNT ; i++ ) {
            cards.add(initPanel());
        }
        return cards;
    }

    private QuizGamePanel initPanel(){
        if(questionIndex < questions.size() && questionIndex < QUESTION_COUNT){
            Question q = questions.get(questionIndex);
            nextQuestion();
            return new QuizGamePanel(q.getQuestion(), q.getOptions(), q.getAnswer());
        }
        return null;
    }

    private void nextQuestion(){
        questionIndex++;
    }
}