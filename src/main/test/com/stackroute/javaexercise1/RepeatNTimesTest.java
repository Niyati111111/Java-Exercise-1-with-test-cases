package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class RepeatNTimesTest {

    RepeatNTimes repeatNTimes;

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
        repeatNTimes = new RepeatNTimes();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        repeatNTimes = null;
    }

    @Test
    public void givenStringAndNumberNDisplayLastNCharactersNTimes() {
        //arrange

        //act
        String result = repeatNTimes.repeat("Stackroute",2);
        //assert
        assertEquals("Stackroutetete",result);
    }

    @Test
    public void givenStringAndNumberN1DisplayLastN1CharactersN1Times() {
        //arrange

        //act
        String result = repeatNTimes.repeat("Stackroute",5);
        //assert
        assertEquals("Stackrouterouterouterouterouteroute",result);
    }

    @Test
    public void givenStringAndNumberN2DisplayLastNCharactersN2Times() {
        //arrange

        //act
        String result = repeatNTimes.repeat("Stackroute",1);
        //assert
        assertEquals("Stackroutee",result);
    }

}