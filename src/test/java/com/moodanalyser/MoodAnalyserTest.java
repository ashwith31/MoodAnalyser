package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void Given_i_Am_In_SadMood_ShouldReturn_sad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a happy mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy" , mood);
    }
}
