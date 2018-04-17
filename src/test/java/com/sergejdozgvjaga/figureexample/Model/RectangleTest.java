package com.sergejdozgvjaga.figureexample.Model;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RectangleTest {


    private List<Rectangle> actual() {
        List<Rectangle> actual = Arrays.asList(
                new Rectangle("First rectangle",   Color.RED,    2, 3),
                new Rectangle("Second rectangle",  Color.GREEN,  1, 2),
                new Rectangle("Third rectangle",   Color.BLUE,   7, 4)
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
        Rectangle rectangle = new Rectangle();
        int actual = rectangle.Square(1, 2);
        assertEquals(2, actual);

    }

    @org.junit.Test
    public void square2() {
        Rectangle rectangle = new Rectangle();
        int actual = rectangle.Square(2, 4);
        assertEquals(8, actual);

    }

    @org.junit.Test
    public void square3() {
        Rectangle rectangle = new Rectangle();
        int actual = rectangle.Square(3, 3);
        assertEquals(9, actual);

    }

    @org.junit.Test
    public void perimeter() {
        Rectangle rectangle = new Rectangle();
        int actual = rectangle.Perimeter(1, 2);
        assertEquals(6,actual);

    }

    @org.junit.Test
    public void perimeter2() {
        Rectangle rectangle = new Rectangle();
        int actual = rectangle.Perimeter(2, 4);
        assertEquals(12,actual);

    }

    @org.junit.Test
    public void perimeter3() {
        Rectangle rectangle = new Rectangle();
        int actual = rectangle.Perimeter(3, 3);
        assertEquals(12,actual);

    }

    @org.junit.Test
    public void equalsPersons() {

        assertThat(actual(), hasItems(
                new Rectangle("First rectangle",   Color.RED,    2, 3),
                new Rectangle("Second rectangle",  Color.GREEN,  1, 2),
                new Rectangle("Third rectangle",   Color.BLUE,   7, 4)
        ));
    }

    @org.junit.Test
    public void equalsPersons2() {

        assertThat(actual(), containsInAnyOrder(
                new Rectangle("First rectangle",   Color.RED,    2, 3),
                new Rectangle("Second rectangle",  Color.GREEN,  1, 2),
                new Rectangle("Third rectangle",   Color.BLUE,   7, 4)
        ));
    }

    @org.junit.Test
    public void equalsPropertyPersonsAndValue() {

        //Test class property, and its value
        assertThat(actual(), containsInAnyOrder(
                hasProperty("name", is("First rectangle")),
                hasProperty("name", is("Second rectangle")),
                hasProperty("name", is("Third rectangle"))
        ));
    }
}
