package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;

    @Before
    public void setUp() {
        
        reverseString = new ReverseString();
    }

    @After
    public void tearDown() {
        
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
