package org.danielfc.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * fibonacci 0->0
 * fibonacci 1->1
 * fibonacci 2->1
 * fibonacci 3->2
 * fibonacci 4->3
 * fibonacci 10->55
 * fibonacci negative number->error
 */



class FibonacciTest {

    private Fibonacci fibonacci;
    @BeforeEach
    private void setup(){
        fibonacci = new Fibonacci();
    }

    @AfterEach
    private void finish(){
        fibonacci = null;
    }

    @Test
    public void shouldComputeReturnZeroIfTheNumberIsZero(){
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsTwo(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);
        assertEquals(expectedValue,obtainedValue);
    }


}