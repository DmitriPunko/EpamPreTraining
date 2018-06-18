package by.epam.preTraining.punkoDmitri.tasks.task03;

public class MoodSensor {
    public static final String HAPPY_SMILE = ":)";
    public static final String UNHAPPY_SMILE = ":(";
    public static final String PLAYFUL_SMILE = ":P";
    public static final String INDIFFERENT_SMILE = ":|";
    public static final String CHEERFUL_SMILE = ":D";

    public static final int NUMBER_FOR_HAPPY_SMILE = 0;
    public static final int NUMBER_FOR_UNHAPPY_SMILE = 1;
    public static final int NUMBER_FOR_PLAYFUL_SMILE = 2;
    public static final int NUMBER_FOR_INDIFFERENT_SMILE = 3;

    public static final int BORDER_OF_RANDOM_INTERVAL = 5;


    public static String getMood() {
        int rand = (int) (Math.random() * BORDER_OF_RANDOM_INTERVAL);

        String mood;

        if (rand == NUMBER_FOR_HAPPY_SMILE){
            mood = HAPPY_SMILE;
        } else if (rand == NUMBER_FOR_UNHAPPY_SMILE){
            mood = UNHAPPY_SMILE;
        } else if (rand == NUMBER_FOR_PLAYFUL_SMILE){
            mood = PLAYFUL_SMILE;
        } else if (rand == NUMBER_FOR_INDIFFERENT_SMILE){
            mood = INDIFFERENT_SMILE;
        } else mood = CHEERFUL_SMILE;

        return mood;
    }
}
