package com.sergejdozgvjaga.figureexample.View;

import com.sergejdozgvjaga.figureexample.Serialized;
import com.sergejdozgvjaga.figureexample.SortedOperations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Logger;

public class Panels extends JPanel {

    private final Logger logger = Logger.getLogger(String.valueOf(Panels.class));

    private SortedOperations sort;
    private Serialized serialized;
    private JTextArea  area;
    private JScrollPane scrollPane;

    public Panels() {

        super(new BorderLayout());
        this.add(exitPanel(), BorderLayout.SOUTH);
        this.add(sortPanel(), BorderLayout.WEST);
        this.add(showTextPanel(), BorderLayout.CENTER);
    }

    /**
     * Method create Panel with buttons,
     * that sorted Person list in different ways
     *
     * @return Panel with different buttons on it
     * */
    private JPanel sortPanel(){

        logger.info("start sortPanel()");
        area = new JTextArea();
        serialized = new Serialized();
        sort = new SortedOperations();

        JPanel sortPanel = new JPanel();
        sortPanel.setLayout(new GridLayout(9,1));

        sortPanel.add(btnShowNames());
        sortPanel.add(btnSortByXReverseOrder());
        sortPanel.add(btnSortByYReverseOrder());
        sortPanel.add(btnMaxX());
        sortPanel.add(btnMaxY());
        sortPanel.add(btnCircles());
        sortPanel.add(btnRectangles());
        sortPanel.add(btnSerialize());
        sortPanel.add(btnDeserialize());
        logger.info("exit sortPanel");

        return sortPanel;
    }

    /**
     * Method create Panel, that contain button "Exit"
     * @return Panel with button Exit
     * */
    private JPanel exitPanel(){

        logger.info("start exitPanel()");
        JPanel exitPanel = new JPanel();
        exitPanel.add(btnExit());
        logger.info("exit exitPanel()");
        return exitPanel;
    }

    /**
     * Method create Panel, that show text area
     * @return Panel with JTextArea with scrollPanes (horizontal and vertical)
     * */
    private JPanel showTextPanel(){
        logger.info("start showTextPanel()");
        area = new JTextArea(30, 35);
        // don't editable TextArea
        area.setEditable(false);

        JPanel showTextPanel = new JPanel();
        // vertical and horizontal JScrollPane
        scrollPane = new JScrollPane(area);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        showTextPanel.add(scrollPane);

        logger.info("exit showTextPanel()");
        return showTextPanel;
    }

    /**
     * Method create Button "Exit"
     * @return close application
     * */
    private JButton btnExit(){
        logger.info("start btnExit");
        JButton btnExit= new JButton("Exit");
        btnExit.addActionListener((ActionEvent e) -> {
            System.out.println("Exit");
            System.exit(0);
        });
        logger.info("exit btnExit()");
        return btnExit;
    }

    /**
     * Method create Button "Serialize to file"
     * @return white Persons list to file "person.dat"
     * */
    private JButton btnSerialize(){
        logger.info("start btnSerialize()");
        JButton btnSerialize = new JButton("Serialize to file");
        btnSerialize.addActionListener((ActionEvent e) -> {
            serialized.serialize();
            area.setText("DATA IS SERIALIZE TO FILE");
        });
        logger.info("exit btnSerialize()");
        return btnSerialize;
    }

    /**
     * Method create Button "Deserialize from file"
     * @return deserialize Person list
     * */
    private JButton btnDeserialize(){
        logger.info("start btnDeserialize()");
        JButton btnDeserialize = new JButton("Deserialize from file");
        btnDeserialize.addActionListener((ActionEvent e) -> {
            serialized.deserialize();
        });
        logger.info("exit btnDeserialize()");
        return btnDeserialize;
    }

    /**
     * Method create Button "Sort by X reverse order"
     * @return show list Figure, sort by X reverse order
     * */
    private JButton btnSortByXReverseOrder() {
        logger.info("start btnSortByXReverseOrder()");
        JButton btnSortByName = new JButton("Sort by X reverse order");
        btnSortByName.addActionListener((ActionEvent e) -> {
            area.setText(sort.stringGetFiguresMaxXReverseOrder());
        });
        logger.info("exit btnSortByXReverseOrder()");
        return btnSortByName;
    }

    /**
     * Method create Button "Sort by Y reverse order"
     * @return show list Figure, sort by Y reverse order
     * */
    private JButton btnSortByYReverseOrder(){
        logger.info("start btnSortByYReverseOrder()");
        JButton btnSortByAge = new JButton("Sort by Y reverse order");
        btnSortByAge.addActionListener((ActionEvent e) -> {
            area.setText(sort.stringGetFiguresMaxYReverseOrder());
        });
        logger.info("exit btnSortByYReverseOrder()");
        return btnSortByAge;
    }

    /**
     * Method create Button "Show only Names"
     * @return show Names of Figure list
     * */
    private JButton btnShowNames(){
        logger.info("start btnShowNames()");
        JButton btnShowNames = new JButton("Show only Names");
        btnShowNames.addActionListener((ActionEvent e) -> {
            area.setText(sort.stringGetNames());
        });
        logger.info("exit btnShowNames()");
        return btnShowNames;
    }

    /**
     * Method create Button "Maximum X"
     * @return show maximum X
     * */
    private JButton btnMaxX(){
        logger.info("start btnMaxX()");
        JButton btnX = new JButton("Maximum X");
        btnX.addActionListener((ActionEvent e) -> {
            area.setText(sort.printMaxX());
            sort.printMaxXValue();
        });
        logger.info("exit btnMaxX()");
        return btnX;
    }

    /**
    * Method create Button "Maximum Y"
    * @return show maximum Y
    * */
    private JButton btnMaxY(){
        logger.info("start btnMaxY()");
        JButton btnY = new JButton("Maximum Y");
        btnY.addActionListener((ActionEvent e) -> {
            area.setText(sort.printMaxY());
            sort.printMaxYValue();
        });
        logger.info("exit btnMaxY()");
        return btnY;
    }

    /**
     * Method create Button "Circles"
     * @return show all circles
     * */
    private JButton btnCircles(){
        logger.info("start btnCircles()");
        JButton btnY = new JButton("Circles");
        btnY.addActionListener((ActionEvent e) -> {
            area.setText(sort.stringGetFiguresCircle());
        });
        logger.info("exit btnCircles()");
        return btnY;
    }

    /**
     * Method create Button "Rectangles"
     * @return all rectangles
     * */
    private JButton btnRectangles(){
        logger.info("start btnRectangles()");
        JButton btnY = new JButton("Rectangles");
        btnY.addActionListener((ActionEvent e) -> {
            area.setText(sort.stringGetFiguresRectangle());
        });
        logger.info("exit btnRectangles()");
        return btnY;
    }
}