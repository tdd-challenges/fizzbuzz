package io.tdd.kata;

import io.tdd.kata.Number;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;

public class FizzBuzzTest {
    private Number number = new Number(100);

    @Test
    @DisplayName("index 0 is 1")
    public void test_index_0_is_1() {
       List<String> arr = number.generateArray();
       assertEquals("1", arr.get(0));
    }
    @Test
    @DisplayName("index 1 is 2")
    public void test_index_1_is_2(){
        List<String> arr = number.generateArray();
        assertEquals("2", arr.get(1));
    }

    @Test
    public void test_index_2_is_Fizz(){
        List<String> arr = number.generateArray();
        assertEquals("Fizz", arr.get(2));
    }

    @Test
    public void test_index_4_is_Buzz(){
        List<String> arr = number.generateArray();
        assertEquals("Buzz", arr.get(4));
    }

    @Test
    public void test_index_14_is_FizzBuzz(){
        List<String> arr = number.generateArray();
        assertEquals("FizzBuzz", arr.get(14));
    }
}
