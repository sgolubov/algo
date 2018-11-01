package ua.com.golubov.algo.klarna;

public class One {

    public static String maskify(String creditCardNumber) {
        if (creditCardNumber == null) {
            throw new IllegalArgumentException("Credit card number can't be null!");
        }

        if (creditCardNumber.equals("") || creditCardNumber.length() < 6) {
            return creditCardNumber;
        }

        char[] resultChars = new char[creditCardNumber.length()];

        resultChars[0] = creditCardNumber.charAt(0);

        for (int i = 1; i < creditCardNumber.length() - 4; i++) {
            char currentChar = creditCardNumber.charAt(i);
            if (Character.isDigit(currentChar)) {
                resultChars[i] = '#';
                continue;
            }
            resultChars[i] = currentChar;
        }

        for (int i = creditCardNumber.length() - 4; i < creditCardNumber.length(); i++) {
            resultChars[i] = creditCardNumber.charAt(i);
        }


        return String.valueOf(resultChars);
    }

}
