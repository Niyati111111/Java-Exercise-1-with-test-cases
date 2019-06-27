package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class NthIterationTest {

    NthIteration nthIteration;

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
        nthIteration = new NthIteration();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        nthIteration = null;
    }

    @Test
    public void givenNumberNDisplayNthNumberNTimes() {
        //arrange

        //act
        String result = nthIteration.iterate(5);
        //assert
        assertEquals("122333444455555", result);
    }

    @Test
    public void givenNumberN1DisplayNthNumberN1Times() {
        //arrange

        //act
        String result = nthIteration.iterate(2);
        //assert
        assertEquals("122", result);
    }

    @Test
    public void givenNumberN2DisplayNthNumberN2Times() {
        //arrange

        //act
        String result = nthIteration.iterate(5);
        //assert
        assertEquals("122333444455555", result);
    }

}