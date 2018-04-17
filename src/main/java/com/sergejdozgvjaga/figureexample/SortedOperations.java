package com.sergejdozgvjaga.figureexample;

import com.sergejdozgvjaga.figureexample.Data.FiguresData;
import com.sergejdozgvjaga.figureexample.Model.Figure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class SortedOperations {

    private final Logger logger = Logger.getLogger(String.valueOf(SortedOperations.class));

    private FiguresData figuresData;

    /**
    * Method sort collection ArrayList<Figure>  by X in reverse order
    * @return ArrayList<Figure> in reverse order, sorted by X
    * */
    private ArrayList<Figure> getFiguresMaxXReverseOrder(){
        logger.info("start getFiguresMaxXReverseOrder()");
        figuresData = new FiguresData();
        ArrayList<Figure> personSortByAge = figuresData.getAllFigures();
        personSortByAge.sort(Comparator.nullsFirst(Comparator.comparing(Figure::getX).reversed()));
        logger.info("exit getFiguresMaxXReverseOrder()");
        return personSortByAge;
    }

    /**
     * Method sort collection ArrayList<Figure>  by Y in reverse order
     * @return ArrayList<Figure> in reverse order, sorted by Y
     * */
    private ArrayList<Figure> getFiguresMaxYReverseOrder(){
        logger.info("start getFiguresMaxYReverseOrder()");
        figuresData = new FiguresData();
        ArrayList<Figure> personSortByAge = figuresData.getAllFigures();
        personSortByAge.sort(Comparator.nullsFirst(Comparator.comparing(Figure::getY).reversed()));
        logger.info("exit getFiguresMaxYReverseOrder()");
        return personSortByAge;
    }

    /**
    * Method sort collection of Circles, sorted by X
    * @return collection of Circles , sorted by X
    *
    * */
    private ArrayList<Figure> getFiguresCircle(){
        logger.info("start getFiguresCircle()");
        figuresData = new FiguresData();
        ArrayList<Figure> personSortByAge = figuresData.getAllCircles();
        personSortByAge.sort(Comparator.nullsFirst(Comparator.comparing(Figure::getX)));
        logger.info("exit getFiguresCircle()");
        return personSortByAge;
    }


    /**
     * Method sort collection of Rectangles, sorted by X
     * @return collection of Rectangles, sorted by X
     *
     * */
    private ArrayList<Figure> getFiguresRectangle(){
        logger.info("start getFiguresRectangle()");
        figuresData = new FiguresData();
        ArrayList<Figure> personSortByAge = figuresData.getAllRectangles();
        personSortByAge.sort(Comparator.nullsFirst(Comparator.comparing(Figure::getX)));
        logger.info("exit getFiguresRectangle()");
        return personSortByAge;
    }

    /**
     * Method sort collection of Figures, and get only Names from it
     * @return collection of Figures, get only Names
     *
     * */
    private List<String> getAllNames(){
        logger.info("start getAllNames()");
        List<String> getAllNames = getFiguresMaxXReverseOrder().stream()
                .map(x -> x.getName()).collect(Collectors.toList());
        logger.info("exit getAllNames()");
        return getAllNames;
    }

    /**
    * Method getFiguresRectangle() convert to String
    * @return method getFiguresRectangle(), convert to String
    * */
    public String stringGetFiguresCircle() {
        logger.info("statr stringGetFiguresCircle()");
        List<Figure> list = getFiguresRectangle();
        String listString = list.stream().map(Object::toString).collect(Collectors.joining(", "));
        logger.info("exit stringGetFiguresCircle()");
        return listString;
    }

    /**
     * Method getFiguresCircle() convert to String
     * @return method getFiguresCircle(), convert to String
     * */
    public String stringGetFiguresRectangle() {
        logger.info("start stringGetFiguresRectangle()");
        List<Figure> list = getFiguresCircle();
        String listString = list.stream().map(Object::toString).collect(Collectors.joining(", "));
        logger.info("exit stringGetFiguresRectangle()");
        return listString;
    }

    /**
     * Method getFiguresMaxXReverseOrder() convert to String
     * @return method getFiguresMaxXReverseOrder(), convert to String
     * */
    public String stringGetFiguresMaxXReverseOrder() {
        logger.info("start stringGetFiguresMaxXReverseOrder()");
        List<Figure> list = getFiguresMaxXReverseOrder();
        String listString = list.stream().map(Object::toString).collect(Collectors.joining(", "));
        logger.info("exit stringGetFiguresMaxXReverseOrder()");
        return listString;
    }

    /**
     * Method getFiguresMaxYReverseOrder() convert to String
     * @return method getFiguresMaxYReverseOrder(), convert to String
     * */
    public String stringGetFiguresMaxYReverseOrder() {
        logger.info("start stringGetFiguresMaxYReverseOrder()");
        List<Figure> list = getFiguresMaxYReverseOrder();
        String listString = list.stream().map(Object::toString).collect(Collectors.joining(", "));
        logger.info("exit stringGetFiguresMaxYReverseOrder()");
        return listString;
    }

    /**
     * Method getAllNames() convert to String
     * @return method getAllNames(), convert to String
     * */
    public String stringGetNames() {
        logger.info("start stringGetNames()");
        List<String> list = getAllNames();
        String listString = list.stream().map(Object::toString).collect(Collectors.joining("\n "));
        logger.info("exit stringGetNames()");
        return listString;
    }

    /**
    * Method get all X from collection
    * @return all X from collection
    * */
    private List<Integer> getAllX(){
        logger.info("start getAllX()");
        List<Integer> getAllX = getFiguresMaxXReverseOrder().stream()
                .map(x -> x.getX()).collect(Collectors.toList());

        logger.info("exit getAllX()");
        return getAllX;
    }

    /**
     * Method get all Y from collection
     * @return all Y from collection
     * */
    private List<Integer> getAllY(){
        logger.info("start getAllY()");
        List<Integer> getAllY = getFiguresMaxYReverseOrder().stream()
                .map(x -> x.getY()).collect(Collectors.toList());
        logger.info("exit getAllY()");
        return getAllY;
    }

    /**
    * Method find maximum X in collection
    * @return maximum X
    * */
    public String printMaxX(){
        logger.info("start printMaxX()");
        String xx = getAllX().get(0).toString();
        logger.info("exit printMaxX()");
        return xx;
    }

    /**
     * Method find maximum Y in collection
     * @return maximum Y
     * */
    public String printMaxY(){
        logger.info("start printMaxY()");
        String yy = getAllY().get(0).toString();
        logger.info("exit printMaxY()");
        return yy;
    }

    /**
    * Method print maximum X from the collection
    * */
    public void printMaxXValue(){
        System.out.println(getFiguresMaxXReverseOrder().get(0).getX());
    }

    /**
     * Method print maximum Y from the collection
     * */
    public void printMaxYValue(){
        System.out.println(getFiguresMaxYReverseOrder().get(0).getY());
    }
}
