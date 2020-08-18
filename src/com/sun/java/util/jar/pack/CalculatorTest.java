package com.sun.java.util.jar.pack;


import TEST.Calculator;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    private static Calculator calculator=new Calculator();
    @Before
    public void setUp() throws Exception {
        System.out.println ("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println ("测试结束");
    }

    @Test
    public void testadd() {
        calculator.add(2,2);
        System.out.println ("add测试开始");
        assertEquals(4,calculator.getResult());
    }

    @Test
    public void testsubtract() {
        calculator.subtract(4,2);
        System.out.println ("subtract测试开始");
        assertEquals(2,calculator.getResult());
    }

    @Test
    public void testmultipe() {
        calculator.multipe(4,2);
        System.out.println ("multiple测试开始");
        assertEquals(8,calculator.getResult());
        // fail("not yet implemented");

    }

    @Test(timeout = 2000)
    public void testdivide() {
        /*for (;;);*///除法死循环测试
    }
    @Test(expected = ArithmeticException.class)
    public void testdivideZero2()//除法分母为零测试
    {
        calculator.divide(2,0);
    }

    @Test
    public void getResult() {
        calculator.getResult();
    }
    public static junit.framework.Test suite() {
        junit.framework.Test test=new TestSuite(CalculatorTest.class);
        return test;
    }

}