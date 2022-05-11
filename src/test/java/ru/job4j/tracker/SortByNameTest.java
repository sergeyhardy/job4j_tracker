package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByNameTest {

    @Test
    public void ascByName() {
        List<Item> items = Arrays.asList(
                new Item(2, "Ivan"),
                new Item(1, "Sergey"),
                new Item(3, "Alex")
        );
        Collections.sort(items);
        List<Item> expected = items;
        Collections.sort(expected, new ItemAscByName());
        assertNotEquals(items, is(expected));

    }

    @Test
    public void descByName() {
        List<Item> items = Arrays.asList(
                new Item(2, "Ivan"),
                new Item(1, "Sergey"),
                new Item(3, "Alex")
        );
        Collections.sort(items);
        List<Item> expected = items;
        Collections.sort(expected, new ItemDescByName());
        assertNotEquals(items, is(expected));

    }
}