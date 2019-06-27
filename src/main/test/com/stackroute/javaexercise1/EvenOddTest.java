package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class EvenOddTest {

     EvenOdd evenOdd;


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
        evenOdd = new EvenOdd();
    }

    @After
    public void tearDown() {
        System.out.println("After");
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
    public void givenOutOfRangeShouldPrintNeitherTomNorJerry() {
        //arrange

        //act
        String result = evenOdd.tomJerry(3);
        //assert
        assertEquals("Neither Tom nor Jerry", result);

    }

}