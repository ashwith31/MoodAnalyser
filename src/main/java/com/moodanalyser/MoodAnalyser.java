package com.moodanalyser;

public class MoodAnalyser {

    public static String analyseMood(String message) {
        if (message.contains("sad"))
            return "sad";
        else
            return "Happy";
    }
}
