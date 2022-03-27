package unittests;

import com.company.geometry.Geometry;
import java.util.HashMap;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;


class DistanceTest {
    Geometry geometry = new Geometry();
    HashMap<String, int[]> points = new HashMap<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void distanceBetweenTwoPoints() {
        points.put("p1", new int[]{1, 2});
        points.put("p2", new int[]{4, 3});

        double expected = 3.1622776601683795;
        OptionalDouble actual = geometry.distanceBetweenTwoPoints(points);

        assertTrue(actual.isPresent(), "actual is empty");
        assertEquals(expected, actual.getAsDouble(), "Actual value is unexpected");
    }

    @org.junit.jupiter.api.Test
    void slopeOfTwoPoints() {
        points.put("p1", new int[]{3, 3});
        points.put("p2", new int[]{6, 5});

        double expected = (double) 2 / 3;
        OptionalDouble actual = geometry.slopeOfTwoPoints(points);

        assertTrue(actual.isPresent(), "actual is empty");
        assertEquals(expected, actual.getAsDouble(), "Actual value is unexpected");
    }

    @org.junit.jupiter.api.Test
    void sendOnePoint() {
        points.put("p1", new int[]{1, 2});
        OptionalDouble actual = geometry.distanceBetweenTwoPoints(points);

        assertFalse(actual.isPresent(), "Actual is NOT empty");
    }
}