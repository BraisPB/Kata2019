package com.cifpcarballeira.katas.FizzBuzz.Test;

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM121
 */
public class TestFizzBuzz {

    public TestFizzBuzz() {
    }

    @Test
    public void test1devolve1() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals("1", result);
    }

    @Test
    public void test2devolve2() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(2);
        assertEquals("2", result);
    }
    
    @Test
    public void test3devolve3() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(3);
        assertEquals("Fizz", result);
    }
    @Test
    public void test5devolveBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(5);
        assertEquals("Buzz", result);
    }
     @Test
    public void test15devolveFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }
    @Test
    public void testcontiene3devolveFizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(13);
        assertEquals("Fizz", result);
    }

}
