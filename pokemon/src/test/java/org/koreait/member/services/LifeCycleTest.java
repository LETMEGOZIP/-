package org.koreait.member.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class LifeCycleTest {

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("after each");
    }

    @Test
    void test1(){
        System.out.println("Test1");
    }

    @Test
    void test2(){
        System.out.println("TEst2");
    }

    @Test
    void test3(){
        System.out.println("Test3");
    }

    @Test
    @Timeout(3L)
    void timeout() throws Exception {
        System.out.println("test3");
        Thread.sleep(5000);
    }
}
