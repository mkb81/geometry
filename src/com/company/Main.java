package com.company;

import com.company.geometry.Geometry;
import com.company.geometry.Point;

import java.util.HashMap;
import java.util.OptionalDouble;

public class Main {
    /**
     * Main methode
     *
     * @param args not used
     */
    public static void main(String[] args) {
        HashMap<String, int[]> points = new HashMap<>();
        Point Point_1 = new Point(1, 2);
        Point Point_2 = new Point(4, 3);
        Geometry geometry = new Geometry();
        OptionalDouble distance;

        points.put("p1", new int[]{Point_1.getPointX(), Point_1.getPointY()});
        points.put("p2", new int[]{Point_2.getPointX(), Point_2.getPointY()});
        distance = geometry.distanceBetweenTwoPoints(points);
        if (distance.isPresent()) {
            showOutput(Point_1, Point_2, "distance", distance.getAsDouble());
        }

        points.clear();
        Point_1.setPointX(12);
        Point_1.setPointY(2);
        Point_2.setPointY(-3);
        Point_2.setPointY(-21);
        points.put("p1", new int[]{Point_1.getPointX(), Point_1.getPointY()});
        points.put("p2", new int[]{Point_2.getPointX(), Point_2.getPointY()});
        distance = geometry.slopeOfTwoPoints(points);
        if (distance.isPresent()) {
            showOutput(Point_1, Point_2, "slope", distance.getAsDouble());
        }

    }

    /**
     * Prints the calculation results on console.
     *
     * @param point_1 x/y point coordinates of point 1
     * @param point_2 x/y point coordinates of point 2
     * @param message Type of geometry calculation
     * @param result The result value of a geometry calculation
     */
    private static void showOutput(Point point_1, Point point_2, String message, double result) {
        System.out.println("The " + message + " between P1(" + point_1.getPointX() + "/" + point_1.getPointY() + ") and " +
                "P2(" + point_2.getPointX() + "/" + point_2.getPointY() + ") is " + result);
    }
}
