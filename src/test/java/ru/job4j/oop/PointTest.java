package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenCoord14And25And36ThenDistance5dot20() {
        Point c = new Point(1, 2, 3);
        Point d = new Point(4, 5, 6);
        double dist3d = c.distance3d(d);
        double expected = 5.20;
        double scale = Math.pow(10, 2);
        dist3d = Math.ceil(dist3d * scale) / scale;
        Assert.assertEquals(expected, dist3d, 0.01);
    }

    @Test
    public void whenCoord139And17And43ThenDistance7dot28() {
        Point c = new Point(13, 1, 4);
        Point d = new Point(9, 7, 3);
        double dist3d = c.distance3d(d);
        double expected = 7.28;
        double scale = Math.pow(10, 2);
        dist3d = Math.ceil(dist3d * scale) / scale;
        Assert.assertEquals(expected, dist3d, 0.01);
    }
}