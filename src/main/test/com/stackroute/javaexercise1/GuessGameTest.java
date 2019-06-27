package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class GuessGameTest {

    GuessGame guessGame ;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Before class");

    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("After class");

    }


    @Before
    public void setUp() {
        System.out.println("Before");
        guessGame = new GuessGame();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        guessGame = null;
    }

    @Test
    public void givenTargetShouldGenerateRandomUntilTargetMatchesRandom() {
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
    public void givenNumberGreaterThan100ShouldReturnErrorMessage() {
        //arrange

        //act
        String result = guessGame.guessNumber(221);
        //assert
        assertEquals("Target is out of bounds", result);
    }








}