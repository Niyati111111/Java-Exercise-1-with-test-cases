package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd evenOdd;

    @Before
    public void setUp() {
<<<<<<< HEAD

=======
        
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        evenOdd = new EvenOdd();
    }

    @After
    public void tearDown() {
<<<<<<< HEAD

=======
        
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        evenOdd = null;
    }

    @Test
    public void givenOddShouldPrintTom() { //checks if the function returns Tom
        //arrange

        //act
        String result = evenOdd.tomJerry(23);
        //assert
        assertEquals("Tom",result);
    }

    @Test
    public void givenEvenShouldPrintJerry() { //checks if the function returns Jerry
        //arrange

        //act
        String result = evenOdd.tomJerry(24);
        //assert
        assertEquals("Jerry",result);
    }

    @Test
    public void givenOutOfRangeShouldPrintNeither() { //checks if the function returns Neither Tom Nor Jerry
        //arrange

        //act
        String result = evenOdd.tomJerry(3);
        //assert
        assertEquals("Neither Tom nor Jerry", result);

    }

<<<<<<< HEAD
    @Test
    public void givenNegativeShouldPrintNeither() { //checks if the function returns Neither Tom Nor Jerry
        //arrange

        //act
        String result = evenOdd.tomJerry(-3);
        //assert
        assertEquals("Neither Tom nor Jerry", result);

    }

    @Test
    public void givenZeroShouldPrintNeither() { //checks if the function returns Neither Tom Nor Jerry
        //arrange

        //act
        String result = evenOdd.tomJerry(0);
        //assert
        assertEquals("Neither Tom nor Jerry", result);

    }



}
=======
}
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
