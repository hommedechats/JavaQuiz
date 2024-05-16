package QuizGame;

public class Player {

    private static Player instance; //singleton
    private String name;
    private double score;
    private int currentQuestionIndex;
    private double timeSpent;


    public Player() {
        this.name = "";
        this.score = 0;
        this.currentQuestionIndex = 0;
        this.timeSpent = 0.0;
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
        return currentQuestionIndex;
    }

    public void updateCurrentQuestionIndex() {
        this.currentQuestionIndex += 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }
}
