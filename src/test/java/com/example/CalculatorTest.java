package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.calculate(10, 5, "add"));
    }
    
    @Test
    public void testDivisionByZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.calculate(10, 0, "div"));
    }
}