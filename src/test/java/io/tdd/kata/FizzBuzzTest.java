package io.tdd.kata;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

    public FizzBuzz fizzBuzz;

    @BeforeEach
    public  void setup(){
    }
    @Test
    public void testExample() {
        assertTrue( fizzBuzz.case1(1) );
    }
}
