package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {


    @Test
    public void testDotProductWithDifferentSizedVectors() {
        Vector vector1 = new Vector(new int[]{1, 2, 3});
        Vector vector2 = new Vector(new int[]{4, 5});

        VectorSizeMismatchException thrown = assertThrows(VectorSizeMismatchException.class, () -> {
            vector1.dotProduct(vector2);
        });
        assertEquals("Vector sizes do not match for dot product calculation.", thrown.getMessage());
    }

    @Test
    public void testVectorIntersection() {
        Vector vector1 = new Vector(new int[]{1, 2, 3});
        Vector vector2 = new Vector(new int[]{4, 5, 3}); // Intersection at value 3

        VectorsIntersectException thrown = assertThrows(VectorsIntersectException.class, () -> {
            vector1.checkIntersection(vector2);
        });
        assertEquals("Vectors intersect at value: 3", thrown.getMessage());
    }


    @Test
    public void testIntersectionWithCommonElement() {
        Vector vector1 = new Vector(new int[]{1, 2, 3});
        Vector vector2 = new Vector(new int[]{1, 4, 5}); // Intersection at value 1

        VectorsIntersectException thrown = assertThrows(VectorsIntersectException.class, () -> {
            vector1.checkIntersection(vector2);
        });
        assertEquals("Vectors intersect at value: 1", thrown.getMessage());
    }
}