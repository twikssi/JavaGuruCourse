package by.andrey.twikss.service;

import by.andrey.twikss.bean.Circle;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class CircleService {
    private Circle circle;
    private Logger logger = LoggerFactory.getLogger(CircleService.class);

    public CircleService(Circle circle) {
        this.circle = circle;
    }

    public double doubleCalculateArea(){
        logger.info("Calculate circle area");
        return Math.pow(circle.getRadius(),2)*3.14;
    }
}
