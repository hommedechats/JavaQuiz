package Leaderboard;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import QuizGame.Player;

public class WriteToJson {

    private String filename;
    private Gson gson;

    WriteToJson(String filename) {
        this.filename = filename;
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void write(ArrayList<Player> obj) {
        try (java.io.FileWriter writer = new java.io.FileWriter(filename)) {
            gson.toJson(obj, new TypeToken<ArrayList<Player>>() {
            }.getType(), writer);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
