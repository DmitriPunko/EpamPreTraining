package by.epam.preTraining.punkoDmitri.tasks.task02;

public class MeanOfNumbers {
    public static double calcArithmeticMean(int number) {
        int firstNumber = number / 100000;
        int secondNumber = (number / 10000) % 10;
        int thirdNumber = (number / 1000) % 10;
        int fourthNumber = number / 100 % 10;
        int fifthNumber = (number / 10) % 10;
        int sixthNumber = number % 10;
        double arithmeticMean = (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber) / 6.0;
        return arithmeticMean;
    }

    public static double calcGeometricMean(int number) {
        int firstNumber = number / 100000;
        int secondNumber = (number / 10000) % 10;
        int thirdNumber = (number / 1000) % 10;
        int fourthNumber = (number / 100) % 10;
        int fifthNumber = (number / 10) % 10;
        int sixthNumber = number % 10;
        double geometricMean = Math.pow(firstNumber *
                secondNumber * thirdNumber * fourthNumber * fifthNumber * sixthNumber, 1/6.);
        return  geometricMean;
    }
}
