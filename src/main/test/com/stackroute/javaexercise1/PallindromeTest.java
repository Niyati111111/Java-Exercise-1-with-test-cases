package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class PallindromeTest {

    Pallindrome pallindrome;

    @Before
    public void setUp() {
        pallindrome = new Pallindrome();
    }

    @After
    public void tearDown() {
        
        pallindrome = null;
    }

    @Test
    public void givenPallindromeNumberShouldPrintPallindrome() {
        //arrange

        //act
        String result = pallindrome.pallindromeCheck(1246226421);
        //assert
        assertEquals("The number is a pallindrome and the sum of even digits is greater than 25",result);
    }

    @Test
    public void givenNegativeNumberReturnError() {
        //arrange

        //act
        String result = pallindrome.pallindromeCheck(-1221);
        //assert
        assertEquals("Invalid Input!",result);
    }

    @Test
    public void givenNonPallindromeShouldPrintNotPallindrome() {
        //arrange

        //act
        String result = pallindrome.pallindromeCheck(543);
        //assert
        assertEquals("The number is not a pallindrome", result);
    }


}
