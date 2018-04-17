package com.sergejdozgvjaga.figureexample.Model;

import java.io.Serializable;
import java.util.logging.Logger;

public class Rectangle extends Figure implements Serializable {

    private final Logger logger = Logger.getLogger(String.valueOf(Rectangle.class));

    public Rectangle() {
    }

    public Rectangle(String name, Color color, int x, int y) {
        super(name, color, x, y);
    }

    /**
    * Method count square of rectangle
    * @param x  - rectangle length
    * @param y - rectangle height
    *
    * @return square of rectangle
    * */
    @Override
    public int Square(int x, int y) {
        logger.info("start Square(int x, int y)");
        int squareRectangle = x * y;
        logger.info("exit Square(int x, int y)");
        return squareRectangle;
    }

    /**
     * Method count perimeter of rectangle
     * @param x  - rectangle length
     * @param y - rectangle height
     *
     * @return perimeter of rectangle
     * */
    @Override
    public int Perimeter(int x, int y) {
        logger.info("start Perimeter(int x, int y)");
        int perimeterRectangle = 2 * (x + y);
        logger.info("exit Perimeter(int x, int y)");
        return perimeterRectangle;
    }
}
