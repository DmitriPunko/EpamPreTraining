package by.epam.preTraining.punkoDmitri.tasks.task04;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test Heads or Tails: ");
        System.out.println(HeadsOrTails.tossACoin(1000) + "\n");


        System.out.println("Test Perfect Number: ");
        System.out.println(6 + " " + PerfectNumber.isNumberPerfect(6));
        System.out.println(7 + " " + PerfectNumber.isNumberPerfect(7));
        System.out.println(28 + " " + PerfectNumber.isNumberPerfect(28) + "\n");

        System.out.println("Test Largest numeral of number: ");
        System.out.println(123456789 + " " + NumberLogic.getLargestNumberOfNatural(123456789) + "\n");

        System.out.println("Test Palindrome number: ");
        System.out.println(12321 + " " + NumberLogic.isNumberPalindrome(12321));
        System.out.println(123421 + " " + NumberLogic.isNumberPalindrome(123421) + "\n");

        System.out.println("Test is Prime number: ");
        System.out.println(1 + " " + NumberLogic.isNumberPrime(1));
        System.out.println(2 + " " + NumberLogic.isNumberPrime(2));
        System.out.println(3 + " " + NumberLogic.isNumberPrime(3));
        System.out.println(17 + " " + NumberLogic.isNumberPrime(17));
        System.out.println(18 + " " + NumberLogic.isNumberPrime(18) + "\n");

        System.out.println("Test GCD of numbers: ");
        System.out.println(3 + " " + 2 + " : " + NumberLogic.getGCDOfNumbers(3, 2));
        System.out.println(2700 + " " + 90 + " : " + NumberLogic.getGCDOfNumbers(2700, 90) + "\n");

        System.out.println("Test NOKs of numbers: ");
        System.out.println(15 + " " + 35 + " : " + NumberLogic.getNOKsOfNumbers(15, 35));
        System.out.println(17 + " " + 35 + " : " + NumberLogic.getNOKsOfNumbers(17, 35) + "\n");

        System.out.println("Test get Simple Dividers of number: ");
        System.out.println(235 + " " + NumberLogic.getSimpleDividersOfNumber(235));
        System.out.println(888 + " " + NumberLogic.getSimpleDividersOfNumber(888) + "\n");

        System.out.println("Test get Count of different numerals of number: ");
        System.out.println(132456789 + " " + NumberLogic.getCountOfDiffNumerals(123456789));
        System.out.println(111111111 + " " + NumberLogic.getCountOfDiffNumerals(111111111));

    }
}
