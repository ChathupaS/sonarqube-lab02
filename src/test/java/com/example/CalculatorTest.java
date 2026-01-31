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
    public void testAddAgain() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.calculate(10, 5, "add-again"));
    }
    
    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.calculate(10, 5, "sub"));
    }
    
    @Test
    public void testSubAgain() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.calculate(10, 5, "sub-again"));
    }
    
    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.calculate(10, 5, "mul"));
    }
    
    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.calculate(10, 5, "div"));
    }
    
    @Test
    public void testDivisionByZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.calculate(10, 0, "div"));
    }
    
    @Test
    public void testModulo() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.calculate(10, 3, "mod"));
    }
    
    @Test
    public void testPower() {
        Calculator calc = new Calculator();
        assertEquals(32, calc.calculate(2, 5, "pow"));
    }
    
    @Test
    public void testInvalidOperation() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.calculate(10, 5, "invalid"));
    }
    
    @Test
    public void testAddNumbers() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.addNumbers(10, 5));
    }
    
    @Test
    public void testSumValues() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.sumValues(10, 5));
    }
    
    @Test
    public void testAddAgainMethod() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.addAgain(10, 5));
    }
}