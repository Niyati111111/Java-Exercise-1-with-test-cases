package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd evenOdd;

    @Before
    public void setUp() {
        
        evenOdd = new EvenOdd();
    }

    @After
    public void tearDown() {
        
        evenOdd = null;
    }

    @Test
    public void givenOddShouldPrintTom() {
        //arrange

        //act
        String result = evenOdd.tomJerry(23);
        //assert
        assertEquals("Tom",result);
    }

    @Test
    public void givenEvenShouldPrintJerry() {
        //arrange

        //act
        String result = evenOdd.tomJerry(24);
        //assert
        assertEquals("Jerry",result);
    }

    @Test
    public void givenOutOfRangeShouldPrintNeither() {
        //arrange

        //act
        String result = evenOdd.tomJerry(3);
        //assert
        assertEquals("Neither Tom nor Jerry", result);

    }

}
