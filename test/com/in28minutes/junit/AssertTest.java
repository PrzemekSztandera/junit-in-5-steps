package com.in28minutes.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AssertTest {

    @Test
    public void test() {
        boolean condition = true;
        assertEquals(true, condition);
        assertTrue(condition);
    }
}