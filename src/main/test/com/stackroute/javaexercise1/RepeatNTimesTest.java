package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class RepeatNTimesTest {

    RepeatNTimes repeatNTimes;

    @Before
    public void setUp() {
<<<<<<< HEAD

=======
       
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
        repeatNTimes = new RepeatNTimes();
    }

    @After
    public void tearDown() {
        repeatNTimes = null;
<<<<<<< HEAD

=======
       
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
    }

    @Test
    public void givenStringReturnNCharsNTimes() { //checks whether the last N characters are repeated for N times
        //arrange

        //act
        String result = repeatNTimes.repeat("Stackroute",2);
        //assert
        assertEquals("Stackroutetete",result);
    }

    @Test
    public void givenStringReturnReturnN1CharsN1Times() { //checks whether the last N characters are repeated for N times
        //arrange

        //act
        String result = repeatNTimes.repeat("Stackroute",5);
        //assert
        assertEquals("Stackrouterouterouterouterouteroute",result);
    }

    @Test
    public void givenStringReturnString() { //checks whether the last N characters are repeated for N times
        //arrange

        //act
        String result = repeatNTimes.repeat("Stackroute",0);
        //assert
        assertEquals("Stackroute",result);
    }

<<<<<<< HEAD
    @Test(expected = NullPointerException.class) //checks for exception
    public void inputNullSubstringReturnException() {
        String result = repeatNTimes.repeat(null, 1);
    }


=======
>>>>>>> a5eb5beb4fc714fc77ed2982a43eef28e5b7925c
}
