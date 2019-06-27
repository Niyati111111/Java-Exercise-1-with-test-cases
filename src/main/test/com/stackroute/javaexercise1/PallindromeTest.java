package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class PallindromeTest {

    Pallindrome pallindrome;

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
        pallindrome = new Pallindrome();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        pallindrome = null;
    }

    @Test
    public void givenPallindromeNumberShouldPrintPallindromeNumberWithSumOfEvenDigitsGreaterThan25() {
        //arrange

        //act
        String result = pallindrome.pallindromeCheck(1246226421);
        //assert
        assertEquals("The number is a pallindrome and the sum of even digits is greater than 25",result);
    }

    @Test
    public void givenPallindromeNumberShouldPrintPallindromeNumberWithSumOfEvenDigitsLesserThan25() {
        //arrange

        //act
        String result = pallindrome.pallindromeCheck(1221);
        //assert
        assertEquals("The number is a pallindrome and the sum of even digits is lesser than 25",result);
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