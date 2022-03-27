package com.company.geometry;

public class Point {
    private int x_coordinate;
    private int y_coordinate;

    // constructor
    public Point(int x_coordinate, int y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    // setter
    public void setPointX(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public void setPointY(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    // getter
    public int getPointX() {
        return x_coordinate;
    }

    public int getPointY() {
        return y_coordinate;
    }
}
