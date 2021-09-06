package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    @Test
    public void Given_I_am_in_Sad_Mood_message_Should_Return_SAD() {
        String mood = moodAnalyser.analyseMood("I am in sad mood.");
        Assertions.assertEquals("sad", mood);
    }
    @Test
    public void Given_I_am_in_Any_Mood_message_Should_Return_HAPPY(){
        String mood = moodAnalyser.analyseMood("I am in any mood.");
        Assertions.assertEquals("Happy", mood);
    }
}
