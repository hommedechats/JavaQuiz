package QuizGame;

public class Player {

    private String name;
    private double score;
    private int current_question_index;


    public Player() {
        this.name = "";
        this.score = 0;
        this.current_question_index = 0;
    }

    public void increaseScore(double score) {
        this.score += score;
    }
    
    public double getScore() {
        return score;
    }
    
    public String getName() {
        return name;
    }

    public int getCurrentQuestionIndex() {
        return current_question_index;
    }

    public void setCurrentQuestionIndex(int current_question_index) {
        this.current_question_index = current_question_index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
