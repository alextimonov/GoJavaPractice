package ua.goit.timonov.practice.task_01_4_findMaxNumber;

/**
 * Class to find max number in array
 */
public class FindMaxNumber {
    /**
     * @param input         given array of integer numbers
     * @return              max number in the array
     */
    public int max(int[] input) {
        int foundMax = input[0];
        for (int i = 0; i < input.length ; i++) {
            if (foundMax < input[i]) foundMax = input[i];
        }
        return foundMax;
    }
}
