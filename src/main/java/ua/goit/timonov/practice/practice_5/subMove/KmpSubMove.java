package ua.goit.timonov.practice.practice_5.subMove;

/**
 * Class to find min value of cycle shifts between input and result strings
 */
public class KmpSubMove {

    /* value to return if */
    public static final int FAILURE_VALUE = -1;

    /**
     * finds min value of cycle shifts between input and result strings
     * @param inputStr          input string
     * @param resultStr         result (shifted) string
     * @return                  min value of shifts or -1 if it is impossible to get shifted string from input string
     */
    public int subMoveQuantity(String inputStr, String resultStr) {
        if (inputStr == null || resultStr == null) return FAILURE_VALUE;
        if (inputStr.equals(resultStr)) return 0;
        boolean foundCoincidence = false;
        int step = 1;
        String shiftedString = inputStr;
        while (step <= inputStr.length() && !foundCoincidence) {
            shiftedString = shiftRight(shiftedString);
            if (shiftedString.equals(resultStr)) foundCoincidence = true;
            else step++;
        }
        if (foundCoincidence) return step;
        else return FAILURE_VALUE;
    }

    // makes right cycle shift for given string
    private String shiftRight(String input) {
        String shifted = input.charAt(input.length() - 1) + input.substring(0, input.length() - 1);
        return shifted;
    }
}
