package by.epam.preTraining.punkoDmitri.tasks.task10.model.logic;

public class Recursion {

    public static int getSumOfDigitsOfNumb(int number) {
        final int BORDER_OF_TWO_DIGITS_NUMBER = 10;

        if (number >= BORDER_OF_TWO_DIGITS_NUMBER) {
            return getSumOfDigitsOfNumb(number / 10) + number % 10;
        } else return number;
    }

    public static double pow(double x, int n) {
        if (x == 0 || n < 0) return x;
        if (n == 0) return 1;
        return pow(x, n - 1) * x;
    }

    public static boolean equals(int n, int s) {
        if (n < 0 || s < 0) return false;
        if (n == 0 || s == 0) return n == s;
        return equals(n / 10, s - n % 10);
    }

    public static long getFibNumbByIndex(int index) {
        if (index <= 0) return -1;
        if (index <= 2) return index - 1;
        return getFibNumbByIndex(index - 1) + getFibNumbByIndex(index - 2);
    }


}
