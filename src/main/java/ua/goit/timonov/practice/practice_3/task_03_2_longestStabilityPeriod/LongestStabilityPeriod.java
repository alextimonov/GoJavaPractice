package ua.goit.timonov.practice.practice_3.task_03_2_longestStabilityPeriod;

/**
 * Class that finds longest stability period in the integer array
 * where any value differs from another even or less than 1
 */
public class LongestStabilityPeriod {
    /**
     * finds longest stability period in the integer array
     * @param gdp       given integer array
     * @return          length of longest stability period
     */
    public int count(int[] gdp) {
        if (gdp.length == 0) return 0;
        int longestPeriod = 1;
        for (int i = 0; i < gdp.length; i++) {
            int baseValue = gdp[i];
            int minValid = baseValue - 1;
            int maxValid = baseValue + 1;
            boolean otherValueNotFounded = true;
            int currentPeriod = 1;
            while (i + currentPeriod < gdp.length && isValidValue(gdp[i + currentPeriod], minValid, maxValid)) {
                if (otherValueNotFounded && gdp[i + currentPeriod] < baseValue) {
                    maxValid = baseValue;
                    otherValueNotFounded = false;
                }
                if (otherValueNotFounded && gdp[i + currentPeriod] > baseValue) {
                    minValid = baseValue;
                    otherValueNotFounded = false;
                }
                currentPeriod++;
            }
            if (currentPeriod > longestPeriod) longestPeriod = currentPeriod;
        }
        return longestPeriod;
    }

    // return true if currentValue is in diapason [minValidValue .. maxValidValue] including borders
    private boolean isValidValue(int currentValue, int minValidValue, int maxValidValue) {
        return currentValue >= minValidValue && currentValue <= maxValidValue;
    }
}
