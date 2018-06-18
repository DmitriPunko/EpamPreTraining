package by.epam.preTraining.punkoDmitri.tasks.task03;

public class Vowel {
    public static final String VOWEL = "aeiouyAEIOUY";

    public static final int UNICODE_A_CAPITAL = 97;
    public static final int UNICODE_E_CAPITAL = 101;
    public static final int UNICODE_I_CAPITAL = 105;
    public static final int UNICODE_O_CAPITAL = 111;
    public static final int UNICODE_U_CAPITAL = 117;
    public static final int UNICODE_Y_CAPITAL = 121;

    public static final int UNICODE_A_SMALL = 65;
    public static final int UNICODE_E_SMALL = 69;
    public static final int UNICODE_I_SMALL = 73;
    public static final int UNICODE_O_SMALL = 79;
    public static final int UNICODE_U_SMALL = 85;
    public static final int UNICODE_Y_SMALL = 89;


    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'
                || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I'
                || letter == 'O' || letter == 'U' || letter == 'y' || letter == 'Y';
    }

//    public static boolean isVowel(char letter) {
//        int unicodeOfLetter = (int) letter;
//        return unicodeOfLetter == UNICODE_A_CAPITAL || unicodeOfLetter == UNICODE_E_CAPITAL ||
//                unicodeOfLetter == UNICODE_I_CAPITAL || unicodeOfLetter == UNICODE_O_CAPITAL ||
//                unicodeOfLetter == UNICODE_U_CAPITAL || unicodeOfLetter == UNICODE_Y_CAPITAL ||
//                unicodeOfLetter == UNICODE_A_SMALL || unicodeOfLetter == UNICODE_E_SMALL ||
//                unicodeOfLetter == UNICODE_I_SMALL || unicodeOfLetter == UNICODE_O_SMALL ||
//                unicodeOfLetter == UNICODE_U_SMALL || unicodeOfLetter == UNICODE_Y_SMALL;
//    }

//    public static boolean isVowel(char letter) {
//        return VOWEL.contains(letter + "");
//    }
//
//    public static boolean isVowel(char letter) {
//        if (letter == 'a'){
//            return true;
//        } else if (letter == 'e'){
//            return true;
//        } else if (letter == 'i') {
//            return true;
//        } else if (letter == 'o') {
//            return true;
//        } else if (letter == 'u') {
//            return true;
//        } else if (letter == 'y') {
//            return true;
//        } else if (letter == 'A') {
//            return true;
//        } else if (letter == 'E') {
//            return true;
//        } else if (letter == 'I') {
//            return true;
//        } else if (letter == 'O') {
//            return true;
//        } else if (letter == 'U') {
//            return true;
//        } else if (letter == 'Y') {
//            return true;
//        }
//        return false;
//    }
//
//
//    public static boolean isVowel(char letter) {
//        switch (letter) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//            case 'y':
//            case 'A':
//            case 'E':
//            case 'I':
//            case 'O':
//            case 'U':
//            case 'Y':
//                return true;
//            default:
//                return false;
//        }
//    }
}
