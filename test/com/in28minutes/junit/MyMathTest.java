package com.in28minutes.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }


    @BeforeClass
    public static void beforeClass() {
        System.out.println("before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after Class");
    }

    @Test
    public void sumWith3Numbers() {
        System.out.println("Test1");
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{1,2,3});
        assertEquals(6, result);
    }

    @Test
    public void sumWith1Numbers() {
        System.out.println("Test2");
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{3});
        assertEquals(3, result);
    }
}
