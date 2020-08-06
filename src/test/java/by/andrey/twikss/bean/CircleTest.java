package by.andrey.twikss.bean;

import by.andrey.twikss.service.CircleService;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;


public class CircleTest {

    @Test
    public void testHashCode() {
        Circle circle = new Circle();
        circle.setRadius(5);

        int expected = 1075052575;
        int actual = circle.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Circle circle = new Circle();
        circle.setRadius(5);

        String expected = "Circle{radius=5.0}";
        String actual = circle.toString();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetRadius() {
        Circle circle = new Circle();
        circle.setRadius(5);

        double expected = 5.0;
        double actual = circle.getRadius();
        assertEquals(expected,actual,0.001);
    }

    @Test
    public void testTestEquals() {
        Circle circleRight = new Circle();
        circleRight.setRadius(5);
        Circle circleLeft = new Circle();
        circleLeft.setRadius(5);

        boolean expected = true;
        boolean actual = circleRight.equals(circleLeft);
        assertEquals(expected, actual);
    }

}