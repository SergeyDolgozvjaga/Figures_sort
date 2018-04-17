package com.sergejdozgvjaga.figureexample;

import com.sergejdozgvjaga.figureexample.Data.FiguresData;
import com.sergejdozgvjaga.figureexample.Model.Figure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Serialized {

    private final Logger logger = Logger.getLogger(String.valueOf(Serialized.class));

    String filename = "figure.dat";
    private FiguresData figuresData;

    /**
     * Method serialize data to a file
     * */
    public void serialize(){

        logger.info("start serialize()");
        figuresData = new FiguresData();

        ArrayList<Figure> figureArrayList = figuresData.getAllFigures();

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(figureArrayList);
            logger.info("the record is done");
        }
        catch(Exception ex){
            logger.warning(ex.getMessage());
        }
        logger.info("exit serialize()");
    }

    /**
     * Method deserialize data from file and show them
     * */
    public void deserialize(){

        logger.info("start deserialize()");
        ArrayList<Figure> newFigure = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            newFigure=(ArrayList<Figure>)ois.readObject();
        }
        catch(Exception ex){
            logger.warning(ex.getMessage());
        }

        for(Figure p : newFigure)
            System.out.printf("Имя: %s \t Цвет: %s \t Размер по оси Х: %d \t Размер по оси Y: %d \n", p.getName(), p.getColor(), p.getX() , p.getY());

        logger.info("exit deserialize()");
    }
}
