package com.kodilla.testing.com.kodilla.testing.shape;


import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);

    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);

    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public ArrayList<String> showFigures() {
        ArrayList<String> figureList=new ArrayList<>();
        for (int i = 0; i < shapeList.size(); i++) {
           figureList.add(shapeList.get(i).getShapeName());

        }
        return figureList;
    }

    public int getListSize() {
        return shapeList.size();
    }
}
