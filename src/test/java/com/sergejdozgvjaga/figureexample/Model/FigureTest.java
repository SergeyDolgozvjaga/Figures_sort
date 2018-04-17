package com.sergejdozgvjaga.figureexample.Model;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class FigureTest {

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
