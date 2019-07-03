package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;

    @Before
    public void setUp() {
<<<<<<< HEAD

=======
        
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        reverseString = new ReverseString();
    }

    @After
    public void tearDown() {
<<<<<<< HEAD

=======
        
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        reverseString = null;
    }

    @Test
    public void givenEmptyStringShouldReturnError() { //checks whether it returns error message
        //arrange

        //act
        String result = reverseString.reverse("");
        //assert
        assertEquals("Invalid Input!",result);
    }

    @Test
    public void givenString1ShouldPrintReverse() { //checks whether it returns the reversed string
        //arrange

        //act
        String result = reverseString.reverse("London");
        //assert
        assertEquals("nodnoL",result);
    }

    @Test
    public void givenString2ShouldPrintReverse() { //checks whether it returns the reversed string
        //arrange

        //act
        String result = reverseString.reverse("madam");
        //assert
        assertEquals("madam",result);
<<<<<<< HEAD
    }

    @Test(expected = NullPointerException.class) //checks for exception
    public void inputNullReturnException() {
        String result = reverseString.reverse(null);
=======
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
    }
}
