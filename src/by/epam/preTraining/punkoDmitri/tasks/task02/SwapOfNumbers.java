package by.epam.preTraining.punkoDmitri.tasks.task02;

public class SwapOfNumbers {
    public static void swapNumbers(int a, int b) {
        System.out.println("a = " + a + "; b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + "; b = " + b);
    }
}
