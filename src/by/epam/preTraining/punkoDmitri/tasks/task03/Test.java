package by.epam.preTraining.punkoDmitri.tasks.task03;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test triangle with points: (0,0) (0,6) (8,0)");

        if (Triangle.isPointsFormATriangle(0, 0, 0, 6, 8, 0)) {
            System.out.println("Points form a triangle!");
            if (Triangle.isPointsFormATriangle(0, 0, 0, 6, 8, 0)) {
                System.out.println("Triangle is rectangular!");
            }
        } else {
            System.out.println("Points don't form a triangle!");
        }

        System.out.println("\nTest Dragon with age 310");
        System.out.println("Count of heads: " + Dragon.countTheNumberOfHeads(310));
        System.out.println("Count of eyes: " + Dragon.countTheNumbersOfEyes(310));

        System.out.println("\nTest vowel letters: ");

        System.out.println("Is 'A' vowel? " + Vowel.isVowel('A'));
        System.out.println("Is 'B' vowel? " + Vowel.isVowel('B'));


        System.out.println("\nTest Gregorian Calendar: ");
        System.out.println("With 28.02.2008 (leap year)");
        System.out.println(GregorianCalendar.getDateOfTheNextDay(28, 2, 2008));
        System.out.println("\nWith 28.02.1700 (not a leap year)");
        System.out.println(GregorianCalendar.getDateOfTheNextDay(28, 2, 1700));

        System.out.println("\nTest MoodSensor");
        System.out.println(MoodSensor.getMood());
        System.out.println(MoodSensor.getMood());

    }
}
