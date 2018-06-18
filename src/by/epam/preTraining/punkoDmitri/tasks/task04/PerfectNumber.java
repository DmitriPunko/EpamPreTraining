package by.epam.preTraining.punkoDmitri.tasks.task04;

public class PerfectNumber {

    public static boolean isNumberPerfect(int number) {

        final int ZERO_CHECK = 0;
        final int FIRST_PRIME_NATURAL_NUMBER = 6;

        if (number < FIRST_PRIME_NATURAL_NUMBER) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == ZERO_CHECK) {
                sum += i;
            }
        }

        return sum == number;
    }
}
