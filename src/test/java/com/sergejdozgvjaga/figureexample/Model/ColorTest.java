package com.sergejdozgvjaga.figureexample.Model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorTest {


    @org.junit.Before
    public void setUp() {
        System.out.println("Before test");
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("After test");
    }

    @Test
    public void test(){
        Color color = Color.RED;
        assertEquals(color , Color.RED);

    }

    @Test
    public void test2(){
        Color color = Color.GREEN;
        assertEquals(color , Color.GREEN);

    }

    @Test
    public void test3(){
        Color color = Color.YELLOW;
        assertEquals(color , Color.YELLOW);

    }

    @Test
    public void test4(){
        Color color = Color.BLUE;
        assertEquals(color , Color.BLUE);

    }
}
