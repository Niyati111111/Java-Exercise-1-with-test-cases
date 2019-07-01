package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class GuessGameTest {

    GuessGame guessGame ;

    @Before
    public void setUp() {
       
        guessGame = new GuessGame();
    }

    @After
    public void tearDown() {
     
        guessGame = null;
    }

    @Test
    public void givenTargetShouldReturnWhenMatches() {
        //arrange

        //act
        String result = guessGame.guessNumber(45);
        //assert
        assertEquals("Number matches the original number", result);
    }

    @Test
    public void givenNegativeTargetShouldReturnErrorMessage(){
        //arrange

        //act
        String result = guessGame.guessNumber(-2);
        //assert
        assertEquals("Target is negative", result);
    }

    @Test
    public void givenOutOfRangeShouldReturnErrorMessage() {
        //arrange

        //act
        String result = guessGame.guessNumber(221);
        //assert
        assertEquals("Target is out of bounds", result);
    }








}
