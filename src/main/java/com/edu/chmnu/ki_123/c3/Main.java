package com.edu.chmnu.ki_123.c3;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(new int[]{1, 2, 3});
        Vector vector2 = new Vector(new int[]{4, 5, 6});
        Vector vector3 = new Vector(new int[]{3, 7, 8});
        Vector vector4 = new Vector(new int[]{1, 9, 10});

        try {
            System.out.println("Dot product of vectors 1 and 2: " + vector1.dotProduct(vector2));

            vector1.checkIntersection(vector2);
            vector1.checkIntersection(vector3);
            vector1.checkIntersection(vector4);
        } catch (VectorSizeMismatchException | VectorsIntersectException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Calculation completed.");
        }

    }
}