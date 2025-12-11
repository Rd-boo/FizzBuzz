package com.errady.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void NormalTest (){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.de(1));
    }

    @Test
    void FizzTest() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.de(3));
    }

    @Test
    void BuzzTest() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.de(5));
    }

    @Test
    void FizBuzzTest (){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.de(15));
    }

}