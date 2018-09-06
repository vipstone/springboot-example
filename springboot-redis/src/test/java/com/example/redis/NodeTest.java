package com.example.redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 注解测试类
 */
public class NodeTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("---Before---");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("---After---");
        System.out.println("\r\n");
    }

    @Test
    public void test() {
        System.out.println("this is test");
    }

    @Test
    public void test2() {
        System.out.println("this is test2");
    }

    public void test3() {
        System.out.println("this is test3");
    }
}
