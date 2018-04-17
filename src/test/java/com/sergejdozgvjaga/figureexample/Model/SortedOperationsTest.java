package com.sergejdozgvjaga.figureexample.Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;


public class SortedOperationsTest {

    public List<Circle> actual(){
        List<Circle> actual = Arrays.asList(
                new Circle("First circle",   Color.GREEN,  2, 2),
                new Circle("Second circle",  Color.RED,    3, 3),
                new Circle("Third circle",   Color.YELLOW, 8, 8)
        );
        return actual;
    }

    @Before
    public void setUp() {
        System.out.println("Before test");
    }

    @After
    public void tearDown() {
        System.out.println("After test");
    }

    @Test
    public void stringGetAllNames() {

        List<String> actualList = actual().stream()
                .map(x -> x.getName()).collect(Collectors.toList());

        assertThat(actualList, hasItems("First circle"));
    }

    @Test
    public void checkSize(){
        assertThat(actual(), hasSize(3));
    }

    @Test
    public void containAnyOrder(){

        List<String> actualList = actual().stream()
                .map(x -> x.getName()).collect(Collectors.toList());
        // Can be any order
        assertThat(actualList, containsInAnyOrder("First circle", "Third circle", "Second circle"));
    }

}
