package by.epam.preTraining.punkoDmitri.tasks.task02;

public class NumberSequence {
    public static boolean isNumberFormsAnIncreasingSequence(int number) {
        int firstNumber = number / 1000;
        int secondNumber = (number / 100) % 10;
        int thirdNumber = (number / 10) % 10;
        int fourthNumber = number % 10;

        return (firstNumber < secondNumber) && (secondNumber < thirdNumber) && (thirdNumber < fourthNumber);
    }
}
