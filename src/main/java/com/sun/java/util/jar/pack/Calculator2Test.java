package com.sun.java.util.jar.pack;


import TEST.Calculator2;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculator2Test extends TestCase {
    private static Calculator2 calculator=new Calculator2();
    @Before
    public void setUp() throws Exception {
        System.out.println ("测试2开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println ("测试2结束");
    }

    @Test
    public void testadd() {
        calculator.add2(2,2);
        System.out.println ("add2测试开始");
        assertEquals(4,calculator.getResult2());
    }

    @Test
    public void testsubtract() {
        calculator.subtract2(4,2);
        System.out.println ("subtract2测试开始");
        assertEquals(2,calculator.getResult2());
    }

    @Test
    public void testmultipe() {
        calculator.multipe2(4,2);
        System.out.println ("multiple2测试开始");
        assertEquals(8,calculator.getResult2());
        // fail("not yet implemented");

    }

    @Test(timeout = 2000)
    public void testdivide() {
        /*for (;;);*///除法死循环测试
    }
    @Test(expected = ArithmeticException.class)
    public void testdivideZero2()//除法分母为零测试
    {
        calculator.divide2(2,0);
    }

    @Test
    public void getResult() {
        calculator.getResult2();
    }
    public static junit.framework.Test suite() {
        junit.framework.Test test=new TestSuite(Calculator2Test.class);
        return test;
    }

}