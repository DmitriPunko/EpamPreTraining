package by.epam.preTraining.punkoDmitri.tasks.task04;

import java.util.Random;

public class HeadsOrTails {

    public static String tossACoin(int numOfThrows) {

        final String HEADS = "Heads: ";
        final String TAILS = "Tails: ";

        final int BORDER_FOR_POSITIVE_NUMBER = 0;
        final int BOUND_OF_RANDOM = 2;

        if (numOfThrows < BORDER_FOR_POSITIVE_NUMBER) {
            return "Invalid input!";
        }

        int countOfHeads = 0;
        int countOfTails = 0;

        Random random = new Random();
        for (int i = 0; i < numOfThrows; i++) {
            if (random.nextInt(BOUND_OF_RANDOM) == 0) {
                countOfHeads++;
            } else {
                countOfTails++;
            }
        }
        return HEADS + countOfHeads + " " + TAILS + countOfTails;
    }

}
