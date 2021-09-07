package com.moodanalyser;

public class MoodAnalyser {

    public String analyseMood(String message) throws MoodAnalyserException {

        try {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Please enter valid message");
        }
    }
}
