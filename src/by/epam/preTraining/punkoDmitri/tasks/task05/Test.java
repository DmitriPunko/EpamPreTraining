package by.epam.preTraining.punkoDmitri.tasks.task05;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        double[] doubles1 = {3, 4, 18};
        System.out.println("Test methods with array {3, 4, 18}: \n");

        System.out.println("Max element of array: " + ArrayLogic.getMaxElementOfArray(doubles1));
        System.out.println("Min element of array: " + ArrayLogic.getMinElementOfArray(doubles1) + "\n");

        System.out.println("Arithmetic mean: " + ArrayLogic.getArithmeticMeanOfArray(doubles1));
        System.out.println("Geometric mean: " + ArrayLogic.getGeometricMeanOfArray(doubles1) + "\n");

        System.out.println("Check array for ascending sort:  " + ArrayLogic.isArrSortedByIncreasing(doubles1));
        System.out.println("Check array for descending sort: " + ArrayLogic.isArrSortedByDecreasing(doubles1) + "\n");


        double[] doubles2 = {18, 4, 2};
        System.out.println("Test methods with array {18, 4, 2}: \n");

        System.out.println("Check array for ascending sort:  " + ArrayLogic.isArrSortedByIncreasing(doubles2));
        System.out.println("Check array for descending sort: " + ArrayLogic.isArrSortedByDecreasing(doubles2) + "\n");

        double[] doubles3 = {18, 2, 4, 12, 543, 14};
        System.out.println("Test methods with array {18, 2, 4, 12, 543, 14}: \n");

        System.out.println("Local min: " + ArrayLogic.getLocalMin(doubles3));
        System.out.println("Local max: " + ArrayLogic.getLocalMax(doubles3) + "\n");
        System.out.println("Reversing elements of array with temporary memory: ");
        ArrayLogic.reverseArray(doubles3);
        System.out.println(Arrays.toString(doubles3) + "\n");

        int[] ints = {18, 2, 4, 12, 543, 14};
        System.out.println("Reversing elements of array without temporary memory: ");
        ArrayLogic.reverseArrayWithoutMemory(ints);
        System.out.println(Arrays.toString(ints));

    }
}
