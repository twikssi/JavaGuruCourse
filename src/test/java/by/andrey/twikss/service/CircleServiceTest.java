package by.andrey.twikss.service;

import by.andrey.twikss.bean.Circle;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircleServiceTest{

    @Test
    public void doubleCalculateAreaShouldReturnTrue(){
        Circle circle = new Circle();
        circle.setRadius(5);

        CircleService circleService = new CircleService(circle);
        boolean expected = true;
        boolean actual = circleService.doubleCalculateArea() == 78.5;

        assertEquals(expected,actual);
    }

    @Test
    public void doubleCalculateAreaShouldReturnFalse(){
        Circle circle = new Circle();
        circle.setRadius(5);

        CircleService circleService = new CircleService(circle);
        boolean expected = false;
        boolean actual = circleService.doubleCalculateArea() == 78.133;

        assertEquals(expected,actual);
    }

}