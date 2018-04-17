package com.sergejdozgvjaga.figureexample.Model;

import java.io.Serializable;
import java.util.logging.Logger;

public class Circle extends Figure implements Serializable{

    private final Logger logger = Logger.getLogger(String.valueOf(Circle.class));

    public Circle() {
    }

    public Circle(String name, Color color, int x, int y) {
        super(name, color, x, y);
    }

    /**
     * Method count square of circle
     * @param x  - rectangle width
     * @param y -  rectangle height
     *
     * @return square of circle
     * */
    @Override
    public int Square(int x, int y) {
        logger.info("start Square(int x, int y)");
        int squareCircle = (int)( Math.PI *((x/2) ^ 2));
        logger.info("exit Square(int x, int y)");
        return squareCircle;
    }

    /**
     * Method count perimeter of circle
     * @param x  - rectangle width
     * @param y -  rectangle height
     *
     * @return perimeter of circle
     * */
    @Override
    public int Perimeter(int x, int y) {
        logger.info("start Perimeter(int x, int y)");
        int sizeCircle = (int)(2 * Math.PI * (x/2));
        logger.info("exit Perimeter(int x, int y)");
        return sizeCircle;
    }
}
