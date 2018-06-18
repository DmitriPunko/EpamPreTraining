package by.epam.preTraining.punkoDmitri.tasks.task03;

public class GregorianCalendar {
    public static final int FIRST_MONTH = 1;
    public static final int SECOND_MONTH = 2;
    public static final int THIRD_MONTH = 3;
    public static final int FOURTH_MONTH = 4;
    public static final int FIFTH_MONTH = 5;
    public static final int SIXTH_MONTH = 6;
    public static final int SEVENTH_MONTH = 7;
    public static final int EIGHTH_MONTH = 8;
    public static final int NINTH_MONTH = 9;
    public static final int TENTH_MONTH = 10;
    public static final int ELEVENTH_MONTH = 11;
    public static final int TWELFTH_MONTH = 12;

    public static final int NUMBER_OF_DAYS_IN_LONG_MONTH = 31;
    public static final int NUMBER_OF_DAYS_IN_SHORT_MONTH = 31;
    public static final int DAY_START_OF_THE_MONTH = 1;
    public static final int MONTH_START_OF_THE_YEAR = 1;

    public static final int NUMBER_OF_DAYS_IN_FEBRUARY_LEAP = 29;
    public static final int NUMBER_OF_DAYS_IN_FEBRUARY_NOT_LEAP = 28;

    public static final int HUNDREAD = 100;
    public static final int FOUR_HUNDREAD = 400;
    public static final int FOUR = 4;


    public static String getDateOfTheNextDay(int day, int month, int year) {
        if ((month == FIRST_MONTH || month == THIRD_MONTH || month == FIFTH_MONTH ||
                month == SEVENTH_MONTH || month == EIGHTH_MONTH || month == TENTH_MONTH) &&
                day == NUMBER_OF_DAYS_IN_LONG_MONTH) {
            day = DAY_START_OF_THE_MONTH;
            month++;
        } else if ((month == FOURTH_MONTH || month == SIXTH_MONTH || month == NINTH_MONTH ||
                month == ELEVENTH_MONTH) && day == NUMBER_OF_DAYS_IN_SHORT_MONTH) {
            day = DAY_START_OF_THE_MONTH;
            month++;
        } else if (month == TWELFTH_MONTH && day == NUMBER_OF_DAYS_IN_LONG_MONTH) {
            day = DAY_START_OF_THE_MONTH;
            month = MONTH_START_OF_THE_YEAR;
            year++;
        } else if (month == SECOND_MONTH) {
            if (day < NUMBER_OF_DAYS_IN_FEBRUARY_LEAP && isYearLeap(year)) {
                day++;
            } else if (day < NUMBER_OF_DAYS_IN_FEBRUARY_NOT_LEAP && !isYearLeap(year)) {
                day++;
            } else {
                day = DAY_START_OF_THE_MONTH;
                month++;
            }
        } else day++;

        return "Day: " + day + " Month: " + month + " Year: " + year;
    }

    public static boolean isYearLeap(int year) {
        return ((year % FOUR == 0) && (year % HUNDREAD != 0)) ||
                ((year % FOUR == 0) && (year % HUNDREAD == 0) && (year % FOUR_HUNDREAD == 0));
    }
}
