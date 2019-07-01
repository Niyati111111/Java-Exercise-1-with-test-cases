package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class CharacterTypeTest {

    CharacterType characterType;

    @Before
    public void setUp() {
      
        characterType = new CharacterType();
    }

    @After
    public void tearDown() {
       
        characterType = null;
    }

    @Test
    public void givenCapitalShouldReturnCapital() {
        //arrange

        //act
        String result = characterType.checkType("A");
        //assert
        assertEquals("Capital Result",result);
    }

    @Test
    public void givenSmallShouldReturnSmall() {
        //arrange

        //act
        String result = characterType.checkType("a");
        //assert
        assertEquals("Small Letter",result);
    }

    @Test
    public void givenDigitShouldReturnDigit() {
        //arrange

        //act
        String result = characterType.checkType("3");
        //assert

        assertEquals("Digit",result);

    }

    @Test
    public void givenSpecialShouldReturnSpecial() {
        //arrange

        //act
        String result = characterType.checkType("$");
        //assert
        assertEquals("Special Character",result);
    }


}
