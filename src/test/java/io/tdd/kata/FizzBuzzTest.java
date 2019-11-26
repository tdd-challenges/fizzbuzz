package io.tdd.kata;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
	
    @Test
    public void testExample() {
        assertEquals(1, 1);
    }
    
    FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
    @Test
    public void test_3_output_fizz() {
    	assertEquals("Fizz", fizzBuzzGame.challenge1(3));
    }
    
    @Test
    public void test_5_output_buzz() {
    	assertEquals("Buzz", fizzBuzzGame.challenge1(5));
    }
    
    @Test
    public void test_15_output_fizzbuzz() {
    	assertEquals("FizzBuzz", fizzBuzzGame.challenge1(15));
    }
    
    @Test
    public void test_1_output_1() {
    	assertEquals("1", fizzBuzzGame.challenge1(1));
    }
}
