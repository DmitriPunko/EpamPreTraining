package by.epam.preTraining.punkoDmitri.tasks.task06;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        double[][] matrixDoubles = {{11, 25, 34, 42, 57}, {45, 78, 11, 89, 23}, {12, 63, 51, 84, 57},
                {12, 63, 51, 84, 57}};
        System.out.println("Test with matrixDoubles:  11 25 34 42 57\n" +
                "                   45 78 11 89 23\n" +
                "                   89 12 47 32 86\n" +
                "                   12 63 51 84 57\n");
        System.out.println("Min: ");
        System.out.println(ArrayLogic.getMin(matrixDoubles));

        System.out.println("Max: ");
        System.out.println(ArrayLogic.getMax(matrixDoubles));

        System.out.println("Arithmetical mean: ");
        System.out.println(ArrayLogic.getArithmeticMean(matrixDoubles));

        System.out.println("Geometric mean: ");
        System.out.println(ArrayLogic.getGeometricMean(matrixDoubles));

        System.out.println("Local min");
        System.out.println(ArrayLogic.getLocalMin(matrixDoubles));

        System.out.println("Local max");
        System.out.println(ArrayLogic.getLocalMax(matrixDoubles));

        System.out.println("Transposing matrixDoubles: ");
        double[][] transposedMatrix = ArrayLogic.transposeTheMatrix(matrixDoubles);

        for (double[] aTransposedMatrix : transposedMatrix) {
            System.out.println(Arrays.toString(aTransposedMatrix));

        }

        System.out.println("Transposing matrixInt: ");
        int[][] matrixInt = {{11, 25, 34, 42, 57}, {45, 78, 11, 89, 23}, {12, 63, 51, 84, 57},
                {12, 63, 51, 84, 57}, {14, 57, 51, 63, 51}};
        ArrayLogic.transposeTheSquareMatrix(matrixInt);
        for (int[] aMatrixInt : matrixInt) {
            System.out.println(Arrays.toString(aMatrixInt));
        }
    }
}
