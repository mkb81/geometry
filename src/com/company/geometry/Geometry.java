package com.company.geometry;

import java.util.HashMap;
import java.util.OptionalDouble;

/**
 * Geometry class
 */
public class Geometry {
    /**
     * Verify that two points are given
     *
     * @param Points x/y point coordinates
     * @return True if two points are given, otherwise False
     */
    private boolean checkTwoPoints(HashMap<String, int[]> Points) {
        if (Points.size() != 2) {
            System.err.println("Not two points given!");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Calculate the distance between two given points
     * d = sqrt((𝑥2−𝑥1)^2+(𝑦2−𝑦1)^2)
     *
     * @param Points x/y point coordinates
     * @return An optional with the distance between two points
     */
    public OptionalDouble distanceBetweenTwoPoints(HashMap<String, int[]> Points) {
        if (checkTwoPoints(Points)) {
            int[] p1 = Points.get("p1");
            int[] p2 = Points.get("p2");

            return OptionalDouble.of(Math.sqrt((p2[1] - p1[1]) * (p2[1] - p1[1]) + (p2[0] - p1[0]) * (p2[0] - p1[0])));
        } else {
            return OptionalDouble.empty();
        }
    }

    /**
     * Calculate the slope  between two given points
     * m = (y2-y1) / (x2-x1)
     *
     * @param Points x/y point coordinates
     * @return An optional with the slope two points
     */
    public OptionalDouble slopeOfTwoPoints(HashMap<String, int[]> Points) {
        if (checkTwoPoints(Points)) {
            int[] p1 = Points.get("p1");
            int[] p2 = Points.get("p2");

            return OptionalDouble.of((double) (p2[1] - p1[1]) / (p2[0] - p1[0]));
        } else {
            return OptionalDouble.empty();
        }
    }
}
