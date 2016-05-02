package ua.goit.timonov.practice.practice_2.task_02_1_addNumberBase36;

import java.math.BigInteger;

/**
 * Class that adds two numbers with radix from 2 to 36 (digits should be chars in diapason '0'..'9', 'a'..'z')
 */
public class AddStringNumber {

    /* radix of evaluation */
    public static final int MIN_RADIX = 2;
    public static final int MAX_RADIX = 36;

    /**
     * adds two numbers with given radix
     *
     * @param a     addend number #1 as a string
     * @param b     addend number #2 as a string
     * @param radix radix of evaluation
     * @return result number as a string
     */
    public String add(String a, String b, int radix) {
        BigInteger valueA = parseStringToBigInt(radix, a.toLowerCase());
        BigInteger valueB = parseStringToBigInt(radix, b.toLowerCase());
        BigInteger valueResult = valueA.add(valueB);
        String result = parseBigIntToString(radix, valueResult);
        return result;
    }

    // parses given string to BigInteger value
    private BigInteger parseStringToBigInt(int radix, String string) {
        char[] charArray = string.toCharArray();
        BigInteger result = BigInteger.ZERO;
        BigInteger bigRadix = BigInteger.valueOf(radix);
        for (int i = 0; i < charArray.length; i++) {
            result = result.multiply(bigRadix);
            int adder = CharIntConverter.charToInt(radix, charArray[i]);
//            int adder = Character.digit(charArray[i], radix);
            result = result.add(BigInteger.valueOf(adder));
        }
        return result;
    }

    // parses integer number to a string
    public String parseBigIntToString(int radix, BigInteger number) {
        StringBuilder sb = new StringBuilder();
        BigInteger bigRadix = BigInteger.valueOf(radix);
        if (number.equals(BigInteger.ZERO)) sb.append('0');
        else {
            while (number.compareTo(BigInteger.ZERO) > 0) {
                int digit = number.remainder(bigRadix).intValue();
                char nextChar = CharIntConverter.intToChar(radix, digit);
//                char nextChar = Character.forDigit(digit, radix);
                sb.append(nextChar);
                number = number.divide(bigRadix);
            }
            sb = sb.reverse();
        }
        return sb.toString();
    }
}
