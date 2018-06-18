package by.epam.preTraining.punkoDmitri.tasks.task04;

public class NumberLogic {

    private static final int BORDER_TO_PRIME_NUMBERS = 2;
    private static final int BORDER_FOR_POSITIVE_NUMBER = 1;

    private static final int NEGATIVE_NUMBER = -1;
    private static final int DIVIDER_TEN = 10;
    private static final int ZERO_CHECK = 0;


    public static int getLargestNumberOfNatural(int number) {

        int largestNumber;
        int numeral;

        if (number < BORDER_FOR_POSITIVE_NUMBER) {
            return NEGATIVE_NUMBER;
        }

        largestNumber = number % DIVIDER_TEN;

        while (number != ZERO_CHECK) {
            if ((numeral = number % DIVIDER_TEN) > largestNumber) {
                largestNumber = numeral;
            }
            number /= DIVIDER_TEN;
        }

        return largestNumber;
    }

    public static boolean isNumberPalindrome(int number) {

        int reverseNumber = 0;
        int copyNumber = number;

        if (number < BORDER_FOR_POSITIVE_NUMBER) {
            return false;
        }


        while (number != ZERO_CHECK) {
            reverseNumber = reverseNumber * DIVIDER_TEN + number % DIVIDER_TEN;
            number /= DIVIDER_TEN;
        }

        return copyNumber == reverseNumber;
    }

    public static boolean isNumberPrime(int number) {

        if (number < BORDER_TO_PRIME_NUMBERS) {
            return false;
        }

        for (int i = BORDER_TO_PRIME_NUMBERS; i < number; i++) {
            if (number % i == ZERO_CHECK) {
                return false;
            }
        }

        return true;
    }

    public static String getSimpleDividersOfNumber(int number) {
        StringBuilder dividers = new StringBuilder();

        if (number < BORDER_TO_PRIME_NUMBERS) {
            return NEGATIVE_NUMBER + "";
        }

        while (number >= BORDER_TO_PRIME_NUMBERS) {
            for (int i = BORDER_TO_PRIME_NUMBERS; i <= number; i++) {
                if (number % i == ZERO_CHECK) {
                    dividers.append(i).append(" ");
                    number /= i;
                }
            }
        }

        return dividers.toString();
    }


    public static int getGCDOfNumbers(int a, int b) {
        int gcd = NEGATIVE_NUMBER;
        int min = (a < b) ? a : b;

        if (a < BORDER_FOR_POSITIVE_NUMBER && b < BORDER_FOR_POSITIVE_NUMBER) {
            return gcd;
        }

        if (a == ZERO_CHECK || b == ZERO_CHECK) {
            return (a > b) ? a : b;
        }

        for (int i = 1; i <= min; i++) {
            if (a % i == ZERO_CHECK && b % i == ZERO_CHECK) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int getNOKsOfNumbers(int a, int b) {
        int nok = NEGATIVE_NUMBER;
        int max = (a > b) ? a : b;

        if (a < BORDER_FOR_POSITIVE_NUMBER && b < BORDER_FOR_POSITIVE_NUMBER) {
            return nok;
        }

        int i = max;
        while (true) {
            if (i % a == ZERO_CHECK && i % b == ZERO_CHECK) {
                nok = i;
                break;
            }
            i++;
        }
        return nok;
    }

    public static int getCountOfDiffNumerals(int number) {

        int countOfDiffNumerals = 0;
        String numerals = "";
        int numeral;

        if (number < BORDER_FOR_POSITIVE_NUMBER) {
            return NEGATIVE_NUMBER;
        }


        while (number != ZERO_CHECK) {
            numeral = number % DIVIDER_TEN;
            if (!numerals.contains("" + numeral)) {
                countOfDiffNumerals++;
                numerals += numeral;
            }
            number /= DIVIDER_TEN;
        }

        return countOfDiffNumerals;
    }

}
