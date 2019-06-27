package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;


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
        reverseString = new ReverseString();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        reverseString = null;
    }

    @Test
    public void givenStringShouldPrintReverse() {
        //arrange

        //act
        String result = reverseString.reverse("London");
        //assert
        assertEquals("nodnoL",result);
    }

    @Test
    public void givenString1ShouldPrintReverse() {
        //arrange

        //act
        String result = reverseString.reverse("London");
        //assert
        assertEquals("nodnoL",result);
    }

    @Test
    public void givenString2ShouldPrintReverse() {
        //arrange

        //act
        String result = reverseString.reverse("London");
        //assert
        assertEquals("nodnoL",result);
    }
}