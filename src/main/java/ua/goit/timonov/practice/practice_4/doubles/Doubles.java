package ua.goit.timonov.practice.practice_4.doubles;

/**
 * Created by Alex on 16.05.2016.
 */
public class Doubles {
    public static final char DIGIT_ZERO = '0';
    public static final char DIGIT_NINE = '9';
    public static final char CHAR_DOT = '.';
    public static final char CHAR_EXPONENT_UPPER = 'E';
    public static final char CHAR_EXPONENT_LOWER = 'e';
    public static final char CHAR_DOUBLE_UPPER = 'D';
    public static final char CHAR_DOUBLE_LOWER = 'd';
    public static final char PLUS = '+';
    public static final char MINUS = '-';
    public static final int RADIX = 10;

    private int integerPart = 0;
    private int fractionalPart = 0;
    private int exponentPart = 0;
    private int multiplier = 1;

    private boolean dotFounded = false;
    private int lengthOfIntegerPart = 0;
    private int lengthOfFractionalPart = 0;


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

    private int checkFindFractionalPart(int positionEndOfInteger, int positionEndOfFractional) {
        if (dotFounded && lengthOfIntegerPart == 0 && positionEndOfInteger + 1 >= positionEndOfFractional) {
            throw new IllegalArgumentException("Dot is founded, fractional part has no symbols!");
        }
        return positionEndOfFractional - positionEndOfInteger - 1;
    }

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

    private int checkNextPosition(int position, char[] stringNumber) {
        if (position < stringNumber.length - 1) position++;
        else throw new IllegalArgumentException("Digits are not found!");
        return position;
    }

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

    private double buildDoubleNumber() {
        double result = multiplier * (integerPart + fractionalPart / Math.pow(RADIX, lengthOfFractionalPart));
        result = result * Math.pow(RADIX, exponentPart);
        if (integerPart == 0 && fractionalPart == 0) result = Math.abs(result);
        return result;
    }
}
