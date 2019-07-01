package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class NthIterationTest {

    NthIteration nthIteration;

    @Before
    public void setUp() {
        
        nthIteration = new NthIteration();
    }

    @After
    public void tearDown() {
       
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
