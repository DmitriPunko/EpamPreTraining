package by.epam.preTraining.punkoDmitri.tasks.task05;

public class ArrayLogic {

    public static double getMaxElementOfArray(double[] array) {

        checkArrayForInitialisation(array);

        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static double getMinElementOfArray(double[] array) {

        checkArrayForInitialisation(array);

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static double getArithmeticMeanOfArray(double[] array) {

        checkArrayForInitialisation(array);

        double sumOfArray = 0;

        for (double anArray : array) {
            sumOfArray += anArray;
        }

        return sumOfArray / array.length;
    }

    public static double getGeometricMeanOfArray(double[] array) {

        final int INITIAL_MULTIPLICATION_VALUE = 1;
        final int BORDER_FOR_NEGATIVE_NUMBER = 1;

        checkArrayForInitialisation(array);

        double multiplOfArray = INITIAL_MULTIPLICATION_VALUE;

        for (double anArray : array) {
            if (!(anArray < BORDER_FOR_NEGATIVE_NUMBER)) {
                multiplOfArray *= anArray;
            } else {
                return -1;
            }
        }

        return Math.pow(multiplOfArray, 1. / array.length);
    }

    public static boolean isArrSortedByIncreasing(double[] array) {

        checkArrayForInitialisation(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isArrSortedByDecreasing(double[] array) {

        checkArrayForInitialisation(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static double getLocalMin(double[] array) {

        checkArrayForInitialisation(array);

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] && array[i] < array[i - 1]) {
                return array[i];
            }
        }

        return -1;
    }

    public static double getLocalMax(double[] array) {

        checkArrayForInitialisation(array);

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                return array[i];
            }
        }

        return -1;
    }

    public static void reverseArray(double[] array) {

        checkArrayForInitialisation(array);

        double temp;

        int count = array.length / 2;

        for (int i = 0; i < count; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

    }

    public static void reverseArrayWithoutMemory(int[] array) {

        if (array == null) {
            throw new NullPointerException();
        }

        int count = array.length / 2;

        for (int i = 0; i < count; i++) {
            array[i] = array[i] ^ array[array.length - i - 1];
            array[array.length - i - 1] = array[i] ^ array[array.length - i - 1];
            array[i] = array[i] ^ array[array.length - i - 1];
        }

    }

    private static void checkArrayForInitialisation(double[] array) {
        if (array == null) {
            throw new NullPointerException();
        }
    }

}
