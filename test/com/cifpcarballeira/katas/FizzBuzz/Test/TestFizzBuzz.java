
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
        assertEquals("1",result);
    }
}
