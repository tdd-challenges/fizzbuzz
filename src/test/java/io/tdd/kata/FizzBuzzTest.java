package io.tdd.kata;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.tdd.kata.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    public void test_index_0_is_1() {
        assertEquals("1", fizzBuzz.printFizzBuzz(1).split(",")[0]);
    }
    public void test_index_5_is_Fizz() {
        assertEquals(" Fizz", fizzBuzz.printFizzBuzz(6).split(",")[5]);
    }
    public void test_index_9_is_Buzz() {
        assertEquals(" Buzz", fizzBuzz.printFizzBuzz(10).split(",")[9]);
    }
    public void test_index_14_is_FizzBuzz() {
        assertEquals(" FizzBuzz", fizzBuzz.printFizzBuzz(15).split(",")[14]);
    }
    public void test_end_is_not_comma() {
        assertEquals("1, 2", fizzBuzz.printFizzBuzz(2));
    }
    public void test_14char_linebreak(){
        assertEquals("1, 2, Fizz, 4,\n" +
                " Buzz, Fizz, 7\n" +
                ", 8, Fizz, Buz",fizzBuzz.printFizzBuzz(10));
    }
}