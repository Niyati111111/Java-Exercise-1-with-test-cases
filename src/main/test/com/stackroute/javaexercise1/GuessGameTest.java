package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class GuessGameTest {

<<<<<<< HEAD
    GuessGame guessGame;

    @Before
    public void setUp() {

=======
    GuessGame guessGame ;

    @Before
    public void setUp() {
       
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        guessGame = new GuessGame();
    }

    @After
    public void tearDown() {
<<<<<<< HEAD

=======
     
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        guessGame = null;
    }

    @Test
    public void givenTargetShouldReturnWhenMatches() { //checks if the target matches the randomly generated number
        //arrange

        //act
        String result = guessGame.guessNumber(45);
        //assert
        assertEquals("Number matches the original number", result);
    }

    @Test
<<<<<<< HEAD
    public void givenNegativeTargetShouldReturnErrorMessage() { //checks whether the function returns error message for a negative integer
=======
    public void givenNegativeTargetShouldReturnErrorMessage(){ //checks whether the function returns error message for a negative integer
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        //arrange

        //act
        String result = guessGame.guessNumber(-2);
        //assert
        assertEquals("Target is negative", result);
    }

    @Test
    public void givenOutOfRangeShouldReturnErrorMessage() { //checks whether the function returns error message for an out of range input
        //arrange

        //act
        String result = guessGame.guessNumber(221);
        //assert
        assertEquals("Target is out of bounds", result);
    }


<<<<<<< HEAD
}
=======






}
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
