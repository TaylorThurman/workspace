package com.astontech.fizzBuzzTDD;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FizzBuzzNumberAddTest {
    private FizzBuzzNumberAdd fb;

    @Before
    public void setUP(){
        fb = new FizzBuzzNumberAdd();
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

    @Test
    public void tenReturnsBuzz() {
        assertEquals("Buzz", fb.evaluate(10));
    }

    @Test
    public void fifteenReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fb.evaluate(15));
    }

    @Test
    public void thirtyModulusFifteenReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fb.evaluate(30));
    }


}
