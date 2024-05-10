package QuizGame;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFromJson {

    private ArrayList<Question> questions;
    private ArrayList<Player> leaderboard;

    public ReadFromJson(String filename) {
        this.questions = readAllQuestions(filename);
    }
    
    public ReadFromJson(String filename, boolean isLeaderboard) {
        this.leaderboard = readLeaderboard(filename);
    }

    private ArrayList<Question> readAllQuestions(String filename) {
        
        ArrayList<Question> questions = new ArrayList<Question>();
        Gson gson = new Gson();

        try (Reader reader = new FileReader(filename)) {
            questions = gson.fromJson(reader, new TypeToken<ArrayList<Question>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questions;
    }

    private ArrayList<Player> readLeaderboard(String filename) {
        ArrayList<Player> leaderboard = new ArrayList<Player>();
        Gson gson = new Gson();

        try (Reader reader = new FileReader(filename)) {
            leaderboard = gson.fromJson(reader, new TypeToken<ArrayList<Player>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return leaderboard;
    }

    public ArrayList<Player> getLeaderboard() {
        return leaderboard;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
    
}