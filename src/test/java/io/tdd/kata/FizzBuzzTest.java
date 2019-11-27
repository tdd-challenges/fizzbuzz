package io.tdd.kata;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    public void test_3_print() {
        assertEquals("1, 2, Fizz",FizzBuzz.printNum(3));
    }

    @Test
    public void test_5_print() {
        assertEquals("1, 2, Fizz, 4, Buzz",FizzBuzz.printNum(5));
    }

    @Test
    public void test_15_print() {
        assertEquals( "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", FizzBuzz.printNum(15));
    }
}
