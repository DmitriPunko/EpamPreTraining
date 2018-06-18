package by.epam.preTraining.punkoDmitri.tasks.task02;

public class ReversionOfNumber {
    public static int reverseNumber(int number) {
        int firstNumber = number / 1000000;
        int secondNumber = (number / 100000) % 10;
        int thirdNumber = (number / 10000) % 10;
        int fourthNumber = (number / 1000) % 10;
        int fifthNumber = (number / 100) % 10;
        int sixthNumber = (number / 10) % 10;
        int seventhNumber = number % 10;
        number = seventhNumber * 1000000 + sixthNumber * 100000 + fifthNumber * 10000 +
                fourthNumber * 1000 + thirdNumber * 100 + secondNumber * 10 + firstNumber;

        return number;
    }
}
