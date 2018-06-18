package by.epam.preTraining.punkoDmitri.tasks.task06;

public class ArrayLogic {

    public static double getMin(double[][] array) {

        checkArrayForInitialisation(array);

        checkWhetherArrayIsMatrix(array);

        double min = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }

        return min;
    }

    public static double getMax(double[][] array) {

        checkArrayForInitialisation(array);

        checkWhetherArrayIsMatrix(array);

        double max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        return max;
    }

    public static double getArithmeticMean(double[][] array) {

        final int INITIAL_SUM_VALUE = 0;

        checkArrayForInitialisation(array);

        checkWhetherArrayIsMatrix(array);

        double sumArray = INITIAL_SUM_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumArray += array[i][j];
            }
        }

        return sumArray / (array.length + array[0].length);
    }

    public static double getGeometricMean(double[][] array) {

        final int INITIAL_MULTIPL_VALUE = 1;

        checkArrayForInitialisation(array);

        checkWhetherArrayIsMatrix(array);

        double multiplArray = INITIAL_MULTIPL_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                multiplArray *= array[i][j];
            }
        }

        return Math.pow(multiplArray, 1. / (array.length + array[0].length));
    }

    public static double getLocalMin(double[][] array) {

        checkArrayForInitialisation(array);

        checkWhetherArrayIsMatrix(array);

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[i][j] < array[i][j + 1] && array[i][j] < array[i][j - 1]
                        && array[i][j] < array[i + 1][j] && array[i][j] < array[i - 1][j]) {
                    return array[i][j];
                }
            }
        }

        return -1;
    }

    public static double getLocalMax(double[][] array) {

        checkArrayForInitialisation(array);

        checkWhetherArrayIsMatrix(array);

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j] > array[i][j + 1] && array[i][j] > array[i][j - 1]
                        && array[i][j] > array[i + 1][j] && array[i][j] > array[i - 1][j]) {
                    return array[i][j];
                }
            }

        }

        return -1;
    }

    public static void transposeTheSquareMatrix(int[][] array) {

        checkArrayForInitialisation(array);

        checkWhetherArrayIsMatrix(array);

        if (!isMatrixSquare(array)) {
            throw new IllegalArgumentException("Non-square matrix!");
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                if (i != j) {
                    array[i][j] ^= array[j][i];
                    array[j][i] ^= array[i][j];
                    array[i][j] ^= array[j][i];
                }
            }
        }
    }

    public static double[][] transposeTheMatrix(double[][] array) {

        checkArrayForInitialisation(array);

        checkWhetherArrayIsMatrix(array);

        double[][] transposedMatrix = new double[array[0].length][array.length];

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = array[j][i];
            }
        }
        return transposedMatrix;

    }

    private static void checkArrayForInitialisation(double[][] array) {

        if (array == null) {
            throw new NullPointerException();
        }

        for (double[] anArray : array) {
            if (anArray == null) {
                throw new NullPointerException();
            }
        }
    }

    private static void checkArrayForInitialisation(int[][] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        for (int[] anArray : array) {
            if (anArray == null) {
                throw new NullPointerException();
            }
        }
    }

    private static boolean isArrayMatrix(double[][] array) {

        int countJ = array[0].length;

        for (int i = 1; i < array.length; i++) {
            if (array[i].length != countJ) {
                return false;
            }
        }

        return true;
    }

    private static void checkWhetherArrayIsMatrix(double[][] array) {
        if (!isArrayMatrix(array)) {
            throw new IllegalArgumentException("The array is not a matrix");
        }
    }

    private static boolean isArrayMatrix(int[][] array) {
        int countJ = array[0].length;

        for (int i = 1; i < array.length; i++) {
            if (array[i].length != countJ) {
                return false;
            }
        }

        return true;
    }

    private static void checkWhetherArrayIsMatrix(int[][] array) {
        if (!isArrayMatrix(array)) {
            throw new IllegalArgumentException("The array is not a matrix");
        }
    }

    private static boolean isMatrixSquare(int[][] matrix) {
        return matrix.length == matrix[0].length;
    }

}
