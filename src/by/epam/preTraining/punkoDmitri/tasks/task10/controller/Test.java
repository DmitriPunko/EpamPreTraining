package by.epam.preTraining.punkoDmitri.tasks.task10.controller;

import by.epam.preTraining.punkoDmitri.tasks.task10.model.logic.Recursion;

public class Test {
    public static void main(String[] args) {


        System.out.println(Recursion.getSumOfDigitsOfNumb(4));
        System.out.println(Recursion.getSumOfDigitsOfNumb(40));
        System.out.println(Recursion.getSumOfDigitsOfNumb(400));
        System.out.println(Recursion.getSumOfDigitsOfNumb(405));

        System.out.println(Recursion.pow(1, 5));
        System.out.println(Recursion.pow(1, 0));
        System.out.println(Recursion.pow(1, 1));
        System.out.println(Recursion.pow(1, 5));
        System.out.println(Recursion.pow(1, -1));
        System.out.println(Recursion.pow(2, 4));
        System.out.println(Recursion.pow(2, 1));
        System.out.println(Recursion.pow(2, 0));

        System.out.println(Recursion.equals(0, 0));
        System.out.println(Recursion.equals(1, 0));
        System.out.println(Recursion.equals(0, 1));
        System.out.println(Recursion.equals(7, 10));
        System.out.println(Recursion.equals(10000000, 1));

        System.out.println(Recursion.getFibNumbByIndex(0));
        System.out.println(Recursion.getFibNumbByIndex(1));
        System.out.println(Recursion.getFibNumbByIndex(2));
        System.out.println(Recursion.getFibNumbByIndex(3));
        System.out.println(Recursion.getFibNumbByIndex(4));
        System.out.println(Recursion.getFibNumbByIndex(5));
        System.out.println(Recursion.getFibNumbByIndex(6));
        System.out.println(Recursion.getFibNumbByIndex(-1));
    }


}
