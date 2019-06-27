package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class TotalTest {


    Total total;


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
        total = new Total();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        total = null;
    }

    @Test
    public void givenStringReturnTotal(){
        //arrange

        //act
        int result = total.calculateTotal("12 21");
        //assert
        assertEquals(33,result);
    }

    @Test
    public void givenString1ReturnTotal(){
        //arrange

        //act
        int result = total.calculateTotal("12 21 24");
        //assert
        assertEquals(57,result);
    }

    @Test
    public void givenString2ReturnTotal(){
        //arrange

        //act
        int result = total.calculateTotal("12 21 1 2");
        //assert
        assertEquals(36,result);
    }

}