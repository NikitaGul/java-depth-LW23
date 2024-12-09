package com.edu.chmnu.ki_123.c3;

class Vector {
    private int[] values;

    public Vector(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public int dotProduct(Vector other) throws VectorSizeMismatchException {
        if (this.values.length != other.getValues().length) {
            throw new VectorSizeMismatchException("Vector sizes do not match for dot product calculation.");
        }

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += this.values[i] * other.getValues()[i];
        }
        return sum;
    }

    public void checkIntersection(Vector other) throws VectorsIntersectException {
        for (int i = 0; i < this.values.length; i++) {
            for (int j = 0; j < other.getValues().length; j++) {
                if (this.values[i] == other.getValues()[j]) {
                    throw new VectorsIntersectException("Vectors intersect at value: " + this.values[i]);
                }
            }
        }
    }
}

