package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class NthIterationTest {

    NthIteration nthIteration;

    @Before
    public void setUp() {
<<<<<<< HEAD

=======
        
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        nthIteration = new NthIteration();
    }

    @After
    public void tearDown() {
<<<<<<< HEAD

=======
       
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        nthIteration = null;
    }

    @Test
    public void givenNumberNDisplayNthNumberNTimes() { //checks whether the function returns the nth number n number of times
        //arrange

        //act
        String result = nthIteration.iterate(5);
        //assert
        assertEquals("122333444455555", result);
    }

    @Test
    public void givenNumberN1DisplayNthNumberN1Times() { //checks whether the function returns the nth number n number of times
        //arrange

        //act
        String result = nthIteration.iterate(2);
        //assert
        assertEquals("122", result);
    }

    @Test
    public void givenNumberN2DisplayNthNumberN2Times() { //checks whether the function returns the nth number n number of times
        //arrange

        //act
        String result = nthIteration.iterate(5);
        //assert
        assertEquals("122333444455555", result);
    }

<<<<<<< HEAD
    @Test
    public void givenZeroReturnNull() { //checks for null
        //arrange

        //act
        String result = nthIteration.iterate(0);
        assertNull(result);

    }

=======
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
}
