package ua.com.golubov.algo.klarna;

public class Two {

    public static String numberToOrdinal(Integer number) {
        if (number == null) {
            throw new IllegalArgumentException("Number can't be null!");
        }

        if (number == 0) {
            return "0";
        }

        return String.valueOf(number) +
                getEnding(number);
    }

    private static String getEnding(Integer number) {
        int hRemainder = number % 100;

        if (hRemainder >= 10 && hRemainder <= 20) {
            return "th";

        }

        int tRemainder = number % 10;

        switch (tRemainder) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

}
