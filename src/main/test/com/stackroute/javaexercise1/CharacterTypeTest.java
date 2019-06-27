package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class CharacterTypeTest {

    CharacterType characterType;


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
        characterType = new CharacterType();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        characterType = null;
    }

    @Test
    public void givenCapitalLetterShouldPrintCapitalLetter() {
        //arrange

        //act
        String result = characterType.checkType("A");
        //assert
        assertEquals("Capital Result",result);
    }

    @Test
    public void givenSmallLetterShouldPrintSmallLetter() {
        //arrange

        //act
        String result = characterType.checkType("a");
        //assert
        assertEquals("Small Letter",result);
    }

    @Test
    public void givenDigitShouldPrintDigit() {
        //arrange

        //act
        String result = characterType.checkType("3");
        //assert

        assertEquals("Digit",result);

    }

    @Test
    public void givenSpecialCharacterShouldPrintSpecialCharacter() {
        //arrange

        //act
        String result = characterType.checkType("$");
        //assert
        assertEquals("Special Character",result);
    }


}