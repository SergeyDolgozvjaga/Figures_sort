package com.sergejdozgvjaga.figureexample.Model;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;


public class CircleTest {

    private List<Circle> actual() {
        List<Circle> actual = Arrays.asList(
                new Circle("First circle",   Color.GREEN,  2, 2),
                new Circle("Second circle",  Color.RED,    3, 3),
                new Circle("Third circle",   Color.YELLOW, 8, 8)
        );

        return actual;
    }


    @org.junit.Before
    public void setUp() {
        System.out.println("Before test");
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("After test");
    }

    @org.junit.Test
    public void square() {
        Circle circle = new Circle();
        int actual = circle.Square(2, 2);
        assertEquals(9, actual);

    }

    @org.junit.Test
    public void square2() {
        Circle circle = new Circle();
        int actual = circle.Square(3, 3);
        assertEquals(9, actual);

    }

    @org.junit.Test
    public void perimeter() {
        Circle circle = new Circle();
        int actual = circle.Perimeter(2, 2);
        assertEquals(6,actual);

    }

    @org.junit.Test
    public void perimeter2() {
        Circle circle = new Circle();
        int actual = circle.Perimeter(3, 3);
        assertEquals(6,actual);

    }

    @org.junit.Test
    public void perimeter3() {
        Circle circle = new Circle();
        int actual = circle.Perimeter(4, 4);
        assertEquals(12,actual);

    }


    @org.junit.Test
    public void equalsPersons() {

        assertThat(actual(), hasItems(
                new Circle("First circle",   Color.GREEN,  2, 2),
                new Circle("Second circle",  Color.RED,    3, 3),
                new Circle("Third circle",   Color.YELLOW, 8, 8)
        ));
    }

    @org.junit.Test
    public void equalsPersons2() {

        assertThat(actual(), containsInAnyOrder(
                new Circle("First circle",   Color.GREEN,  2, 2),
                new Circle("Second circle",  Color.RED,    3, 3),
                new Circle("Third circle",   Color.YELLOW, 8, 8)
        ));
    }

    @org.junit.Test
    public void equalsPropertyPersonsAndValue() {

        //Test class property, and its value
        assertThat(actual(), containsInAnyOrder(
                hasProperty("name", is("First circle")),
                hasProperty("name", is("Second circle")),
                hasProperty("name", is("Third circle"))
        ));
    }
}
