package io.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test
	public void to_3_print() {
		assertEquals(FizzBuzz.printTo(3), "1, 2, Fizz");
	}
	
	@Test
	public void to_5_print() {
		assertEquals(FizzBuzz.printTo(5), "1, 2, Fizz, 4,\n Buzz");
	}
	
	@Test
	public void to_15_print() {
		assertEquals(FizzBuzz.printTo(15), "1, 2, Fizz, 4,\n Buzz, Fizz, 7\n, 8, Fizz, Buz\nz, 11, Fizz, 1\n3, 14, FizzBuz\nz");
	}
}
