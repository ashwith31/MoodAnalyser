package com.moodanalyser;

public class MoodAnalyserException extends Exception {
    public ExceptionType type;

    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
    public enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }
}
