package ru.job4j.oop;

import junit.framework.TestCase;

public class PointTest extends TestCase {

    public void testDistance3d() {
        Point c = new Point(1, 2, 3);
        Point d = new Point(4, 5, 6);
        double dist3d = c.distance3d(d);
        double expected = 5.196152422706632;
        assertEquals(dist3d, expected, 0.0001);
    }

    public void testDistance3dSecond() {
        Point c = new Point(13, 1, 4);
        Point d = new Point(9, 7, 3);
        double dist3d = c.distance3d(d);
        double expected = 7.280109889;
        assertEquals(dist3d, expected, 0.0001);
    }
}