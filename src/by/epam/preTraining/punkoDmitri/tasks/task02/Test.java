package by.epam.preTraining.punkoDmitri.tasks.task02;

public class Test {
    public static void main(String[] args) {
        System.out.println(EqualNumbers.isNumbersEqual(1, 1, 1));
        System.out.println(DinosaurLogic.getDinosaurMassInTons(450));
        System.out.println(DinosaurLogic.getDinosaurMassInGrams(450));
        System.out.println(DinosaurLogic.getDinosaurMassInMilligrams(450));
        System.out.println(RingLogic.calcSquare(3, 1.71));
        System.out.println(NumberSequence.isNumberFormsAnIncreasingSequence(5780));
        System.out.println(MeanOfNumbers.calcArithmeticMean(123456));
        System.out.println(MeanOfNumbers.calcGeometricMean(222222));
        System.out.println(ReversionOfNumber.reverseNumber(1234567));
        SwapOfNumbers.swapNumbers(5, 10);
    }
}
