package io.tdd.kata;

import io.tdd.kata.Number;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class FizzBuzzTest {
    private Number number = null;

    @BeforeEach
    public void setup(){
        this.number = new Number(100);
    }

    @Test
    @DisplayName("index 0 is 1")
    public void _index_0_is_1() {
        assertEquals(1, 1);
    }
}
