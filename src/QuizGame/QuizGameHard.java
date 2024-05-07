package QuizGame;

import java.util.ArrayList;

public class QuizGameHard{

    private String filename = "/home/paleva/JavaQuiz/data/hard.json"; // "hard.txt
    private ArrayList<Question> questions;

    public QuizGameHard() {
        // super(diff);
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

    public QuizGamePanel gameLoop(){
        for (Question question : questions) {
            return new QuizGamePanel(question.getQuestion(), question.getOptions(), question.getAnswer());
        }
        return null;
    }

    

}