package io.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    public FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void _given_3_return_Fizz() {
        assertEquals( "Fizz",fizzBuzz.calculation(3));
    }

    @Test
    public void _given_5_return_Buzz() {
        assertEquals( "Buzz",fizzBuzz.calculation(5));
    }

    @Test
    public void _given_15_return_FizzBuzz() {
        assertEquals( "FizzBuzz",fizzBuzz.calculation(15));
    }

    @Test
    public void _given_17_return_FizzBuzz() {
        assertEquals( "17",fizzBuzz.calculation(17));
    }
}
