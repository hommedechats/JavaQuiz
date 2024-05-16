package QuizGame;

public class Player {

    private static Player instance; //singleton
    private String name;
    private int score;
    private int currentQuestionIndex;
    private double timeSpent;


    public Player() {
        this.name = "";
        this.score = 0;
        this.currentQuestionIndex = 0;
        this.timeSpent = 0.0;
    }

    public void increaseScore() {
        this.score += 1;
    }
    
    public int getScore() {
        return score;
    }
    
    public String getName() {
        return name;
    }

    public double getTimeSpent() {
        return timeSpent;
    }

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    public void updateCurrentQuestionIndex() {
        this.currentQuestionIndex += 1;
    }

    public void setCurrentQuestionIndex(int index) {
        this.currentQuestionIndex = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeSpent(double timeSpent) {
        this.timeSpent = timeSpent;
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }
}
