package com.battleships.controller;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Field extends Rectangle{

    public int getxCell() {
        return xCell;
    }

    public int getyCell() {
        return yCell;
    }

    private int xCell, yCell;

    public Field(int size, Color color, int xCell, int yCell) {
        super(size,size);
        super.setFill(color);
        this.xCell = xCell;
        this.yCell = yCell;
    }
}