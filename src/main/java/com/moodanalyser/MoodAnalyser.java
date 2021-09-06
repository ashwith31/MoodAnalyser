package com.moodanalyser;

public class MoodAnalyser {

    public String analyseMood(String message) {
        try {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        } catch (Exception e) {
           return "Its an Exception!!!";
        }
    }
}
