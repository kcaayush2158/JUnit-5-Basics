package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


@SpringBootTest
class DemoApplicationTests {

    @Test
    void testUser(){
        MathUtils mathUtils = new MathUtils();
        int expectedValue = 2;
        int actualValue =  mathUtils.addNumber(1,1);
        assertEquals(expectedValue,actualValue);
    }

    @Test
     void testComputeCircleRadius(){
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793 ,mathUtils.computeCircleArea(10));
    }

    @Test
    void testDivide(){
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> mathUtils.divideNumber(1, 0));
    }

}
