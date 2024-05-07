package QuizGame;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFromJson {

    private ArrayList<Question> questions;

    public ReadFromJson(String filename) {
        this.questions = readAllQuestions(filename);       
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

    public ArrayList<Question> getQuestions() {
        return questions;
    }
    
}