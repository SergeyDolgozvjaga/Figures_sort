package com.sergejdozgvjaga.figureexample.Data;

import com.sergejdozgvjaga.figureexample.Model.Circle;
import com.sergejdozgvjaga.figureexample.Model.Color;
import com.sergejdozgvjaga.figureexample.Model.Figure;
import com.sergejdozgvjaga.figureexample.Model.Rectangle;

import java.util.ArrayList;

/**
 * Class consist data
 * */
public class FiguresData {

    public ArrayList<Figure> getAllCircles(){
        return getCircleData();
    }

    public ArrayList<Figure> getAllRectangles(){
        return  getRectangleData();
    }

    public ArrayList<Figure> getAllFigures(){
        return getBoxData();
    }

    /**
     * Method consist data about Circles
     *
     * @return ArrayList of Circles
     * */
    private ArrayList<Figure> getCircleData(){

        ArrayList<Figure> getCircleData = new ArrayList<>();

        getCircleData.add(new Circle("First circle",   Color.GREEN,  2, 2));
        getCircleData.add(new Circle("Second circle",  Color.RED,    3, 3));
        getCircleData.add(new Circle("Third circle",   Color.YELLOW, 8, 8));
        getCircleData.add(new Circle("Fourth circle",  Color.BLUE,   7, 7));
        getCircleData.add(new Circle("Fifth circle",   Color.YELLOW, 8, 8));
        getCircleData.add(new Circle("Sixth circle",   Color.RED,    1, 1));
        getCircleData.add(new Circle("Seventh circle", Color.BLUE,   4, 4));

        return getCircleData;

    }

    /**
     * Method consist data about Rectangles
     *
     * @return ArrayList of Rectangles
     * */
    private ArrayList<Figure> getRectangleData(){

        ArrayList<Figure> getRectangleData = new ArrayList<>();

        getRectangleData.add(new Rectangle("First rectangle",   Color.RED,    2, 3));
        getRectangleData.add(new Rectangle("Second rectangle",  Color.GREEN,  1, 2));
        getRectangleData.add(new Rectangle("Third rectangle",   Color.BLUE,   7, 4));
        getRectangleData.add(new Rectangle("Fourth rectangle",  Color.YELLOW, 5, 8));
        getRectangleData.add(new Rectangle("Fifth rectangle",   Color.GREEN,  9, 4));
        getRectangleData.add(new Rectangle("Sixth rectangle",   Color.YELLOW, 8, 9));
        getRectangleData.add(new Rectangle("Seventh rectangle", Color.BLUE,   1, 8));
        getRectangleData.add(new Rectangle("Eighth rectangle",  Color.BLUE,   1, 8));

        return getRectangleData;
    }

    /**
     * Method consist data of all Figures (Circles and Rectangles)
     *
     * @return ArrayList of all Figures
     * */
    private ArrayList<Figure> getBoxData(){
        ArrayList<Figure> box = new ArrayList<>();
        box.addAll(getCircleData());
        box.addAll(getRectangleData());

        return box;
    }

}
