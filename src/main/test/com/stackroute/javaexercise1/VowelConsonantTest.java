package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vowelConsonant;

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
        vowelConsonant = new VowelConsonant();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        vowelConsonant = null;
    }

    @Test
    public void givenStringReturnConsonantVowel(){
        //arrange

        //act
        String result = vowelConsonant.determineVowelConsonants("mad");
        //assert
        assertEquals("consonantvowelconsonant", result);
    }

    @Test
    public void givenStringReturnInvalidInput(){
        //arrange

        //act
        String result = vowelConsonant.determineVowelConsonants("@%&");
        //assert
        assertEquals("Invalid Input! Invalid Input! Invalid Input! ", result);
    }

    @Test
    public void givenStringReturnConsonantVowelInvalidInput(){
        //arrange

        //act
        String result = vowelConsonant.determineVowelConsonants("ma@");
        //assert
        assertEquals("consonantvowelInvalid Input! ", result);
    }


}