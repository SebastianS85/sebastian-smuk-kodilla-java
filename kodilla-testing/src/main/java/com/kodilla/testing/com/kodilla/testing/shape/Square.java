package com.kodilla.testing.com.kodilla.testing.shape;

public class Square implements Shape{
    double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return Double.compare(square.edge, edge) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(edge);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public double getField() {
        return edge*edge;
    }

}
