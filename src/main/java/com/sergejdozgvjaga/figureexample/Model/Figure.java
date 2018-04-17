package com.sergejdozgvjaga.figureexample.Model;

import java.io.Serializable;

public abstract class Figure implements Serializable{

    private String name;
    private Color color;
    private int x;
    private int y;

    public Figure() {
    }

    public Figure(String name, Color color, int x, int y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public int Square(int x, int y){
    return 0;
    }


    public int Perimeter(int x, int y){
        return 0;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("***** Person Details *****\n");
        sb.append("Name="+getName()+"\n");
        sb.append("Color="+getColor()+"\n");
        sb.append("X="+getX()+"\n");
        sb.append("Y="+getY()+"\n");
        sb.append("*****************************");
        return sb.toString();

    }
}
