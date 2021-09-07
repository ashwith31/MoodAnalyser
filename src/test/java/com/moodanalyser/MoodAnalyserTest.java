package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void iAmIn_SadMood_ShouldReturn_Sad() throws MoodAnalyserException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String  mood = moodAnalyser.analyseMood("I am in sad mood");
        try
        {
            mood = moodAnalyser.analyseMood("I am in sad mood");
        } catch (MoodAnalyserException e)
        {
            e.printStackTrace();
        }
        Assertions.assertEquals("sad" , mood);
    }
    @Test
    public void iAmIn_anyMood_ShouldReturn_Happy() throws MoodAnalyserException
    {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in any mood");
        try
        {
            mood = moodAnalyser.analyseMood("I am in any mood");
        } catch (MoodAnalyserException e)
        {
            e.printStackTrace();
        }
        Assertions.assertEquals("Happy" , mood);
    }

    @Test
    public void when_Entered_Null_Should_Throw_MoodAnalyzerException()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try
        {
            moodAnalyser.analyseMood(null);

        } catch (MoodAnalyserException e)
        {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void when_Empty_Should_Return_Message()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try
        {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalyserException e)
        {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
            System.out.println(e.getMessage());
        }
    }
}
