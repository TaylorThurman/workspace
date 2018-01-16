package com.astontech.fizzBuzzTDD;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// can create class
// can evaluate (String eval (int number)))
// refactor withe @Before

public class FizzBuzzTest {
    private FizzBuzz fb;

    @Before
    public void setUP(){
        fb = new FizzBuzz();
    }

    @Test
    public  void oneReturnsOne(){
        assertEquals("1",fb.evaluate(1));
    }

    @Test
    public void twoReturnsTwo() {
        assertEquals("2", fb.evaluate(2));
    }

    @Test
    public void threeReturnsFizz() {
        assertEquals("Fizz", fb.evaluate(3));
    }

    @Test
    public void fiveReturnsBuzz() {
        assertEquals("Buzz", fb.evaluate(5));
    }

    @Test
    public void sixReturnsFizz() {
        assertEquals("Fizz", fb.evaluate(6));
    }


}
