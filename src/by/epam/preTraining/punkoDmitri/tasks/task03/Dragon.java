package by.epam.preTraining.punkoDmitri.tasks.task03;

public class Dragon {

    public static final int INCREMENT_OF_HEADS_SINCE_BIRTHDAY_TO_200_YEARS = 3;
    public static final int INCREMENT_OF_HEADS_SINCE_200_TO_300_YEARS = 2;
    public static final int INCREMENT_OF_HEADS_AFTER_300_YEARS = 1;

    public static final int AGE_BORDER_FOR_200 = 200;
    public static final int AGE_BORDER_FOR_300 = 300;

    public static final int CONVERT_HEADS_TO_EYES = 2;

    public static int countTheNumberOfHeads(int age) {
        int heads = INCREMENT_OF_HEADS_SINCE_BIRTHDAY_TO_200_YEARS;

        if (age <= AGE_BORDER_FOR_200) {
            heads += INCREMENT_OF_HEADS_SINCE_BIRTHDAY_TO_200_YEARS * age;
        } else if (age <= AGE_BORDER_FOR_300) {
            heads += (AGE_BORDER_FOR_200 * INCREMENT_OF_HEADS_SINCE_BIRTHDAY_TO_200_YEARS +
                    (age - AGE_BORDER_FOR_200) * INCREMENT_OF_HEADS_SINCE_200_TO_300_YEARS);
        } else
            heads += AGE_BORDER_FOR_200 * INCREMENT_OF_HEADS_SINCE_BIRTHDAY_TO_200_YEARS +
                    (AGE_BORDER_FOR_300 - AGE_BORDER_FOR_200) * INCREMENT_OF_HEADS_SINCE_200_TO_300_YEARS +
                    (age - AGE_BORDER_FOR_300) * INCREMENT_OF_HEADS_AFTER_300_YEARS;

        return heads;
    }

    public static int countTheNumbersOfEyes(int age) {
        return countTheNumberOfHeads(age) * CONVERT_HEADS_TO_EYES;
    }
}
