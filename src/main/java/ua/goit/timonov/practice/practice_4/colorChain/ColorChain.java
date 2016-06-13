package ua.goit.timonov.practice.practice_4.colorChain;

/**
 * Class with method to find number of possible variants to build the chain with given length using links
 * with length 1, 2 and 3 meters
 */
public class ColorChain {

    public static final int COLOR_NUMBER = 3;

    /**
     * finds the number of possible variants to build the chain with given length
     * @param chainLength     given length of the chain
     * @return      number of possible variants
     */
    public int count(int chainLength) {
        if (chainLength < 0)
            throw new IllegalArgumentException("Chain length should not be negative!");
        int variants[] = new int[COLOR_NUMBER];
        for (int i = 0; i <= chainLength ; i++) {
            if (i > COLOR_NUMBER) {
                variants[i % COLOR_NUMBER] = sumArray(variants);
            }
            else {
                if (i < COLOR_NUMBER) {
                    variants[i] = i;
                }
                else {
                    variants[0] = COLOR_NUMBER + 1;
                }
            }
        }
        return variants[chainLength % COLOR_NUMBER];
    }

    // finds sum of elements in array
    private int sumArray(int[] variants) {
        int sum = 0;
        for (int i = 0; i < variants.length; i++) {
            sum += variants[i];
        }
        return sum;
    }
}
