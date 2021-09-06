package com.moodanalyser;

public class MoodAnalyser {

    private String message;

    public static String analyseMood(String message) {
        if (message.contains("sad"))
            return "sad";
        else
            return "Happy";
    }

    void MoodAnalyser(String message) {
        this.message = message;
    }
}
