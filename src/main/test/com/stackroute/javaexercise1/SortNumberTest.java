package com.stackroute.javaexercise1;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class SortNumberTest {

    SortNumber sortNumber;


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
        sortNumber = new SortNumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        sortNumber = null;
    }

    @Test
    public void givenNumberReturnCountOfDigits() {
        //arrange

        //act
        int result = sortNumber.countDigits(1234);
        //assert
        assertEquals(4,result);
    }

    @Test
    public void givenNumberReturnNumberWithDigitsSortedInDescendingOrder() {
        //arrange

        //act
        int arr[] = {3,4,5,2,1};

        String result = sortNumber.sortDigits(arr);
        //assert
        assertEquals( "54321", result);
    }

    @Test
    public void givenNumberReturnSumOfEvenDigits() {
        //arrange

        //act
        int arr[] = {3,4,5,2,1};

        int result = sortNumber.evenSum(arr);
        //assert
        assertEquals(6, result);
    }


}