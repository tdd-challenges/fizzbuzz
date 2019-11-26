package io.tdd.kata;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {
    FizzBuzzArray FB = new FizzBuzzArray();

    @Test
    public void testExample() {
        assertEquals(1, 1);
    }

    @Test
    public void test_true(){
        assertTrue(true);
    }

    @Test
    public void testFizzBuzz10(){
        String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz";
        assertEquals(expected, FB.print(10));
    }

    @Test
    public void testFizzBuzz20(){
        String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz";
        assertEquals(expected, FB.print(20));
    }

    @Test
    public void testFizzBuzz1(){
        String expected = "1";
        assertEquals(expected, FB.print(1));
    }
}
