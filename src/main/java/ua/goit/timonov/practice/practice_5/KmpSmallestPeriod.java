package ua.goit.timonov.practice.practice_5;

/**
 * Created by Alex on 18.05.2016.
 */
public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {
        if (input == null) return null;
        boolean periodNotFounded = true;
        int testValue = 1;
        while (testValue <= input.length() / 2 && periodNotFounded) {
            periodNotFounded = checkPeriod(testValue, input);
            if (periodNotFounded) testValue++;
        }
        if (periodNotFounded) return input;
        else return input.substring(0, testValue);
    }

    private boolean checkPeriod(int testValue, String input) {
        if (input.length() % testValue != 0) return true;
        else {
            String repetition = input.substring(0, testValue);
            boolean foundDifference = false;
            int i = 2;
            int nPeriods = input.length() / testValue;
            while (i <= nPeriods && !foundDifference) {
                int currentPosition = testValue * (i - 1);
                String subString = input.substring(currentPosition, currentPosition + testValue);
                if (!repetition.equals(subString)) {
                    foundDifference = true;
                }
                i++;
            }
            return foundDifference;
        }
    }
}
