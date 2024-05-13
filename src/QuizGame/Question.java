package QuizGame;
import java.util.ArrayList;

public class Question {
    private String question;
    private String answer;
    private ArrayList<String> options;

    public Question(String question, String answer, ArrayList<String> options) {
        this.question = question;
        this.answer = answer;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

}
