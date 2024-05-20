package QuizGame;

import java.util.concurrent.TimeUnit;

public class Timer {

    private static Timer instance; //singleton
    private long startTime;
    private long endTime;
    private double elapsedTimeMs;
    private long addedTime;

    public double getElapsedTimeMs(){
        return elapsedTimeMs + addedTime;
    }

    public Timer(){
        this.startTime = 0;
        this.endTime = 0;
        this.elapsedTimeMs = 0.0;
        this.addedTime = 0;
    }

    public void resetTimer(){
        this.startTime = 0;
        this.endTime = 0;
        this.elapsedTimeMs = 0.0;
        this.addedTime = 0;
    }

    public void startTimer(){
        startTime = System.nanoTime();
    }

    public void endTimer(){
        endTime = System.nanoTime();
        long elapsed = endTime - startTime;
        elapsedTimeMs = TimeUnit.NANOSECONDS.toMillis(elapsed);
        //System.out.println((elapsedTimeMs + addedTime) / 1000 + "s");
    }

    public void addTime(long addedSeconds){
        addedTime += TimeUnit.SECONDS.toMillis(addedSeconds);
    }

    public static Timer getInstance(){
        if(instance == null){
            instance = new Timer();
        }
        return instance;
    }
}
