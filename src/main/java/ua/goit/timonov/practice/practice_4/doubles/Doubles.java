package ua.goit.timonov.practice.practice_4.doubles;

/**
 * Class to parse string to double number
 */
public class Doubles {
    /* char constants */
    public static final char DIGIT_ZERO = '0';
    public static final char DIGIT_NINE = '9';
    public static final char CHAR_DOT = '.';
    public static final char CHAR_EXPONENT_UPPER = 'E';
    public static final char CHAR_EXPONENT_LOWER = 'e';
    public static final char CHAR_DOUBLE_UPPER = 'D';
    public static final char CHAR_DOUBLE_LOWER = 'd';
    public static final char PLUS = '+';
    public static final char MINUS = '-';
    /* value of used radix */
    public static final int RADIX = 10;

    /* value of integer part of number */
    private int integerPart = 0;
    /* value of fractional part of number */
    private int fractionalPart = 0;
    /* value of exponent part of number */
    private int exponentPart = 0;
    /* multiplier is 1 if number is positive and -1 if it is negative */
    private int multiplier = 1;

    /* flag of finding dot in the string */
    private boolean dotFounded = false;
    /* length of integer part */
    private int lengthOfIntegerPart = 0;
    /* length of fractional part */
    private int lengthOfFractionalPart = 0;


    /**
     * parses double number from given string
     * @param s     given string
     * @return      parsed double number
     */
    public Double parse(String s) {
        char stringNumber[] = s.toCharArray();
        double result = 0;
        try {
            int positionEndOfInteger = parseInteger(0, stringNumber);
            int positionEndOfFractional = parseFractional(positionEndOfInteger, stringNumber);
            int positionEndOfExponent = parseExponent(positionEndOfFractional, stringNumber);
            lengthOfFractionalPart = checkFindFractionalPart(positionEndOfInteger, positionEndOfFractional);
            result = buildDoubleNumber();
        } catch (IllegalArgumentException e) {
            return null;
        }
        return result;
    }

    // finds length of fractional part
    private int checkFindFractionalPart(int positionEndOfInteger, int positionEndOfFractional) {
        if (dotFounded && lengthOfIntegerPart == 0 && positionEndOfInteger + 1 >= positionEndOfFractional) {
            throw new IllegalArgumentException("Dot is founded, fractional part has no symbols!");
        }
        return positionEndOfFractional - positionEndOfInteger - 1;
    }

    // parses integer part of number, returns position of delimiter
    private int parseInteger(int position, char[] stringNumber) {
        boolean delimiterNotFound = true;
        int number = 0;
        multiplier = 1;
        if (stringNumber[position] == MINUS) {
            multiplier = -1;
            position = checkNextPosition(position, stringNumber);
        }
        else {
            if (stringNumber[position] == PLUS) {
                position = checkNextPosition(position, stringNumber);
            }
        }
        while (position < stringNumber.length && delimiterNotFound) {
            char symbol = stringNumber[position];
            if (symbol == CHAR_DOT || symbol == CHAR_EXPONENT_LOWER || symbol == CHAR_EXPONENT_UPPER ||
                    symbol == CHAR_DOUBLE_UPPER || symbol == CHAR_DOUBLE_LOWER) {
                delimiterNotFound = false;
                if (symbol == CHAR_DOT) dotFounded = true;
            }
            else {
                if (symbol >= DIGIT_ZERO && symbol <= DIGIT_NINE) {
                    number = number * RADIX + symbol - DIGIT_ZERO;
                    lengthOfIntegerPart++;
                    position++;
                }
                else {
                    throw new IllegalArgumentException("Wrong symbol is found!");
                }
            }
        }
        integerPart = number;
        return position;
    }

    // returns next position after founded signs "+" or "-" (if it is available)
    private int checkNextPosition(int position, char[] stringNumber) {
        if (position < stringNumber.length - 1) position++;
        else throw new IllegalArgumentException("Digits are not found!");
        return position;
    }

    // parses fractional part of number, returns position of delimiter
    private int parseFractional(int position, char[] stringNumber) {
        if (position == stringNumber.length) return position;
        char symbol = stringNumber[position];
        if (symbol == CHAR_EXPONENT_LOWER || symbol == CHAR_EXPONENT_UPPER ||
                symbol == CHAR_DOUBLE_UPPER || symbol == CHAR_DOUBLE_LOWER) return position;
        position++;
        int number = 0;
        boolean delimiterNotFound = true;
        while (position < stringNumber.length && delimiterNotFound) {
            symbol = stringNumber[position];
            if (symbol == CHAR_EXPONENT_LOWER || symbol == CHAR_EXPONENT_UPPER) {
                delimiterNotFound = false;
            }
            else {
                if (symbol >= DIGIT_ZERO && symbol <= DIGIT_NINE) {
                    number = number * RADIX + symbol - DIGIT_ZERO;
                    position++;
                }
                else {
                    throw new IllegalArgumentException("Wrong symbol is found!");
                }
            }
        }
        fractionalPart = number;
        return position;
    }

    // parses exponent part of number
    private int parseExponent(int position, char[] stringNumber) {
        if (position == stringNumber.length) return position;
        position++;
        int expMultiplier = 1;
        if (stringNumber[position] == MINUS) {
            expMultiplier = -1;
            position = checkNextPosition(position, stringNumber);
        }
        else {
            if (stringNumber[position] == PLUS) {
                position = checkNextPosition(position, stringNumber);
            }
        }
        int number = 0;
        boolean delimiterNotFound = true;
        while (position < stringNumber.length && delimiterNotFound) {
            char symbol = stringNumber[position];
            if (symbol == CHAR_DOUBLE_UPPER || symbol == CHAR_DOUBLE_LOWER) {
                delimiterNotFound = false;
                position++;
            }
            else {
                if (symbol >= DIGIT_ZERO && symbol <= DIGIT_NINE) {
                    number = number * RADIX + symbol - DIGIT_ZERO;
                    position++;
                } else {
                    throw new IllegalArgumentException("Wrong symbol is found!");
                }
            }
        }
        if (position < stringNumber.length) {
            throw new IllegalArgumentException("There are symbols after \"D\" or \"d\"!");
        }
        exponentPart = number * expMultiplier;
        return position;
    }

    // builds double number with founded parts
    private double buildDoubleNumber() {
        double result = multiplier * (integerPart + fractionalPart / Math.pow(RADIX, lengthOfFractionalPart));
        result = result * Math.pow(RADIX, exponentPart);
        if (integerPart == 0 && fractionalPart == 0) result = Math.abs(result);
        return result;
    }
}
