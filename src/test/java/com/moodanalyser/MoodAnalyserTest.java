package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void Given_Null_Mood_should_Return_Happy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try
        {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalyserException e)
        {
            Assertions.assertEquals("Please enter valid message", e.getMessage());
        }
    }
}
